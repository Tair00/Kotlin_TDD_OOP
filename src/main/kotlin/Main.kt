import java.io.File
import kotlin.math.pow
import kotlin.random.Random

fun generateRandomNumber(limit: Int): Int {
    return Random.nextInt(2, limit - 1)
}

fun computeModularExponentiation(base: Int, exponent: Int, modulus: Int): Int {
    return base.toDouble().pow(exponent).toInt() % modulus
}

fun diffieHellmanKeyExchange() {
    // Инициализация известных параметров
    val base = Random.nextInt(2, 20) // Основание
    val modulus = Random.nextInt(100, 200) // Модуль (простое число)

    // Секретные числа
    val privateKeyA = generateRandomNumber(modulus)
    val privateKeyB = generateRandomNumber(modulus)

    // Открытые значения
    val publicValueA = computeModularExponentiation(base, privateKeyA, modulus)
    val publicValueB = computeModularExponentiation(base, privateKeyB, modulus)

    // Вычисление общего секретного ключа
    val sharedSecretA = computeModularExponentiation(publicValueB, privateKeyA, modulus)
    val sharedSecretB = computeModularExponentiation(publicValueA, privateKeyB, modulus)

    // Сохранение данных в файлы
    File("public_keys.txt").writeText(
        "Base (a): $base\nModulus (m): $modulus\n" +
                "Public Value A (L0): $publicValueA\nPublic Value B (Lp): $publicValueB\n"
    )

    File("private_keys.txt").writeText(
        "Private Key A: $privateKeyA\nPrivate Key B: $privateKeyB\n"
    )

    File("shared_secret.txt").writeText(
        "Shared Secret Key (calculated by A): $sharedSecretA\n" +
                "Shared Secret Key (calculated by B): $sharedSecretB\n"
    )

    // Проверка
    if (sharedSecretA == sharedSecretB) {
        println("Общий секретный ключ успешно создан: $sharedSecretA")
    } else {
        println("Ошибка: общий ключи не совпадают!")
    }
}

fun main() {
    // Тестирование с 10 наборами данных
    for (i in 1..10) {
        println("\nТест $i:")
        diffieHellmanKeyExchange()
    }
}
