import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionKtTest {

    private val solution = Solution()



    @Test
    fun testEmptyInput() {
        assertEquals("", solution.longestCommonPrefix(emptyArray()))
    }

    @Test
    fun testSingleString() {
        assertEquals("abc", solution.longestCommonPrefix(arrayOf("abc")))
    }

    @Test
    fun testAllEqualStrings() {
        assertEquals("abc", solution.longestCommonPrefix(arrayOf("abc", "abc", "abc")))
    }

    @Test
    fun testNoCommonPrefix() {
        assertEquals("", solution.longestCommonPrefix(arrayOf("xyz", "123", "!@#")))
    }
}