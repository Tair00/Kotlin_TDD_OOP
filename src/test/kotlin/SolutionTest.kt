import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testLengthOfLongestSubstring() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"))
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"))
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"))
        assertEquals(0, solution.lengthOfLongestSubstring(""))
        assertEquals(1, solution.lengthOfLongestSubstring("a"))
        assertEquals(2, solution.lengthOfLongestSubstring("au"))
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"))
        assertEquals(4, solution.lengthOfLongestSubstring("abcd"))
        assertEquals(5, solution.lengthOfLongestSubstring("tmmzuxt"))
    }
}