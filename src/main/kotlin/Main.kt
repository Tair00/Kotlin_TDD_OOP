import java.io.File
import java.math.BigInteger
import java.util.*

fun generatePrime(bits: Int): BigInteger {
    var prime: BigInteger
    do {
        prime = BigInteger(bits, Random())
    } while (!prime.isProbablePrime(100)) // Проверка на простоту
    return prime
}

fun gcd(a: BigInteger, b: BigInteger): BigInteger {
    var x = a
    var y = b
    while (y != BigInteger.ZERO) {
        val temp = x % y
        x = y
        y = temp
    }
    return x
}

fun modInverse(a: BigInteger, m: BigInteger): BigInteger {
    var m0 = m
    var x0 = BigInteger.ZERO
    var x1 = BigInteger.ONE
    var a1 = a
    while (a1 > BigInteger.ONE) {
        val q = a1 / m0
        var t = m0
        m0 = a1 % m0
        a1 = t
        t = x0
        x0 = x1 - q * x0
        x1 = t
    }
    return if (x1 < BigInteger.ZERO) x1 + m else x1
}

fun generateRSAKeys(bits: Int): Pair<Pair<BigInteger, BigInteger>, Pair<BigInteger, BigInteger>> {
    val p = generatePrime(bits)
    val q = generatePrime(bits)
    val n = p * q
    val k = (p - BigInteger.ONE) * (q - BigInteger.ONE)

    var e = BigInteger("65537") // Часто выбираем 65537 как публичный ключ
    while (gcd(e, k) != BigInteger.ONE) {
        e = e.add(BigInteger.TWO)
    }

    val d = modInverse(e, k)
    return Pair(Pair(e, n), Pair(d, n))
}

fun encrypt(message: String, publicKey: Pair<BigInteger, BigInteger>): List<BigInteger> {
    val (e, n) = publicKey
    return message.map { BigInteger.valueOf(it.toLong()).modPow(e, n) }
}

fun decrypt(encryptedMessage: List<BigInteger>, privateKey: Pair<BigInteger, BigInteger>): String {
    val (d, n) = privateKey
    return encryptedMessage.map { it.modPow(d, n).toChar() }.joinToString("")
}

fun saveKeys(publicKey: Pair<BigInteger, BigInteger>, privateKey: Pair<BigInteger, BigInteger>) {
    val publicFile = "public_key.txt"
    val privateFile = "private_key.txt"

    publicKey.let {
        val (e, n) = it
        File(publicFile).writeText("$e,$n")
    }

    privateKey.let {
        val (d, n) = it
        File(privateFile).writeText("$d,$n")
    }
}

fun loadKeys(): Pair<Pair<BigInteger, BigInteger>, Pair<BigInteger, BigInteger>> {
    val publicKey = File("public_key.txt").readText().split(",").map { BigInteger(it) }
    val privateKey = File("private_key.txt").readText().split(",").map { BigInteger(it) }

    return Pair(Pair(publicKey[0], publicKey[1]), Pair(privateKey[0], privateKey[1]))
}

fun main() {
    // Генерация ключей
    val (publicKey, privateKey) = generateRSAKeys(8)

    // Сохранение ключей в файл
    saveKeys(publicKey, privateKey)

    // Загрузка ключей из файла
    val (loadedPublicKey, loadedPrivateKey) = loadKeys()

    // Сообщение для шифрования
    val message = "Hello RSA!"

    // Шифрование и расшифровка
    val encryptedMessage = encrypt(message, loadedPublicKey)
    val decryptedMessage = decrypt(encryptedMessage, loadedPrivateKey)

    // Вывод результатов
    println("Открытый ключ: ${loadedPublicKey.first}, ${loadedPublicKey.second}")
    println("Закрытый ключ: ${loadedPrivateKey.first}, ${loadedPrivateKey.second}")
    println("Сообщение: $message")
    println("Зашифрованное сообщение: $encryptedMessage")
    println("Расшифрованное сообщение: $decryptedMessage")
}
