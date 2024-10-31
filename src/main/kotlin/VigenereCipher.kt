class VigenereCipher(private val key: String) {

    // Функция шифрования
    fun encrypt(text: String): String {
        val result = StringBuilder()
        val keyLength = key.length
        for (i in text.indices) {
            val currentChar = text[i]
            if (currentChar.isLetter()) {
                val offset = if (currentChar.isUpperCase()) 'A' else 'a'
                val keyChar = key[i % keyLength].toUpperCase()
                val shift = keyChar - 'A'
                val encryptedChar = (currentChar + shift - offset) % 26 + offset
                result.append(encryptedChar.toChar())
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
                val offset = if (currentChar.isUpperCase()) 'A' else 'a'
                val keyChar = key[i % keyLength].toUpperCase()
                val shift = keyChar - 'A'
                val decryptedChar = (currentChar - shift - offset + 26) % 26 + offset
                result.append(decryptedChar.toChar())
            } else {
                result.append(currentChar)
            }
        }
        return result.toString()
    }
}