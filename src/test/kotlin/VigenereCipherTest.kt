import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class VigenereCipherTest {

    @Test
    fun testEncrypt() {
        val testCases = listOf(
            Triple("Friend", "key", "Pvgorb"),
            Triple("Knowledge", "key", "Urmgpcnkc"),
            Triple("Freedom", "key", "Pvcohmw"),
            Triple("Wisdom", "key", "Gmqnsk"),
            Triple("Happiness", "key", "Renzmlowq"),
            Triple("Curiosity", "key", "Mypssqsxw"),
            Triple("Adventure", "key", "Khtorrevc"),
            Triple("Dream", "key", "Nvckq"),
            Triple("StrenGth", "key", "CxporEdl"),
            Triple("FuTure", "key", "PyRevc"),
            Triple("COurage", "key", "MSsbeeo"),
            Triple("InspiratioN", "key", "SrqzmpkxgyR"),
            Triple("ChallengE", "key", "MlyvpcxkC"),
            Triple("PassioN", "key", "ZeqcmmX"),
            Triple("HonestY", "key", "RslowrI"),
            Triple("creativity", "key", "mvckxgfmri"),
            Triple("patience", "key", "zersilmi"),
            Triple("respect", "key", "biqziad"),
            Triple("Integrity", "key", "Srrokpsxw"),
            Triple("Hope", "key", "Rsno")
        )

        for ((plainText, key, expectedEncrypted) in testCases) {
            val cipher = VigenereCipher(key)
            val encryptedText = cipher.encrypt(plainText)
            assertEquals(expectedEncrypted, encryptedText, "Ошибка в шифровании: $plainText с ключом $key")
        }
    }
    private val key = "KEY"

    private val cipher = VigenereCipher(key)
    @Test
    fun testDecryptSimpleText() {
        val encryptedText = "RIJVS" // предполагаем, что "HELLO" было зашифровано ключом "KEY"
        val expectedDecryptedText = "HELLO"
        assertEquals(expectedDecryptedText, cipher.decrypt(encryptedText))
    }

    @Test
    fun testDecryptWithSpacesAndPunctuation() {
        val encryptedText = "RIJV!S" // "HE LL!O" с шифрованием
        val expectedDecryptedText = "HELL!U"
        assertEquals(expectedDecryptedText, cipher.decrypt(encryptedText))
    }

    @Test
    fun testDecryptWithLowercaseText() {
        val encryptedText = "rijvs" // "hello" зашифровано ключом "KEY"
        val expectedDecryptedText = "hello"
        assertEquals(expectedDecryptedText, cipher.decrypt(encryptedText))
    }



    @Test
    fun testDecryptTextWithNonAlphabeticCharacters() {
        val encryptedText = "R1J2V3S!" // Включение чисел и знаков
        val expectedDecryptedText = "H1L2R3I!"
        assertEquals(expectedDecryptedText, cipher.decrypt(encryptedText))

    }
}
