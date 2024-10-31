import java.util.Scanner

fun main() {
    // Создаем объект Scanner для ввода данных с консоли
    val scanner = Scanner(System.`in`)

    // Запрашиваем у пользователя ввод ключа
    println("Введите ключ для шифрования:")
    val key = scanner.nextLine()

    // Создаем экземпляр VigenereCipher
    val cipher = VigenereCipher(key)

    // Запрашиваем у пользователя ввод текста для шифрования
    println("Введите текст для шифрования:")
    val originalText = scanner.nextLine()

    // Шифруем текст
    val encryptedText = cipher.encrypt(originalText)
    println("Зашифрованный текст: $encryptedText")

    // Расшифровываем текст
    val decryptedText = cipher.decrypt(encryptedText)
    println("Расшифрованный текст: $decryptedText")

    // Закрываем сканер
    scanner.close()
}
