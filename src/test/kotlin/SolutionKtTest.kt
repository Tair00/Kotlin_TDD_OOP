import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionKtTest {

    @Test
    fun testLongestPalindrome() {
        assertEquals("bab", longestPalindrome("babad"))
        assertEquals("bb", longestPalindrome("cbbd"))
        assertEquals("a", longestPalindrome("a"))
        assertEquals("aaaaa", longestPalindrome("aaaaa"))
        assertEquals("abcba", longestPalindrome("abcba"))
        assertEquals("aabbccbbaa", longestPalindrome("aabbccbbaa"))
        assertEquals("abccba", longestPalindrome("abccbadef"))
        assertEquals("aaaa", longestPalindrome("aaaaefgh"))
    }
}
