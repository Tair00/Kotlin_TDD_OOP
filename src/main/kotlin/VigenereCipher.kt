class VigenereCipher(private val key: String) {

    // Функция шифрования
    fun encrypt(text: String): String {
        val result = StringBuilder()
        val keyLength = key.length
        for (i in text.indices) {
            val currentChar = text[i]
            if (currentChar.isLetter()) {
                val offset = if (currentChar.isUpperCase()) 'A'.code else 'a'.code
                val keyChar = key[i % keyLength].uppercaseChar()

                val shift = keyChar.code - 'A'.code
                val encryptedChar = ((currentChar.code + shift - offset) % 26 + offset).toChar()
                result.append(encryptedChar)
            } else {
                result.append(currentChar) // Добавляем небуквенные символы без изменения
            }
        }
        return result.toString()
    }

    // Функция расшифрования
    fun decrypt(text: String): String {
        val result = StringBuilder()
        val keyLength = key.length
        for (i in text.indices) {
            val currentChar = text[i]
            if (currentChar.isLetter()) {
                val offset = if (currentChar.isUpperCase()) 'A'.code else 'a'.code
                val keyChar = key[i % keyLength].uppercaseChar()
                val shift = keyChar.code - 'A'.code
                val decryptedChar = (((currentChar.code - shift - offset + 26) % 26) + offset).toChar()
                result.append(decryptedChar)
            } else {
                result.append(currentChar)
            }
        }
        return result.toString()
    }
}
