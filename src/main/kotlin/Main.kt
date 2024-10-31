import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите текст для шифрования:")
    val inputText = scanner.nextLine()

    println("Введите ключевое слово:")
    val key = scanner.nextLine()

    val cipher = VigenereCipher(key)
    val encryptedText = cipher.encrypt(inputText)
    println("Зашифрованный текст: $encryptedText")

    val decryptedText = cipher.decrypt(encryptedText)
    println("Расшифрованный текст: $decryptedText")
}