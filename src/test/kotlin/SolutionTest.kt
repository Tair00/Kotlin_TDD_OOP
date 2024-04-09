import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test



class SolutionTest {
    private val solution = Solution()



    @Test
    fun testLongestPalindromeExample2() {
        val s = "cbbd"
        val expected = "bb"
        val result = solution.longestPalindrome(s)
        assertEquals(expected, result)
    }

    @Test
    fun testLongestPalindromeSingleCharacter() {
        val s = "a"
        val expected = "a"
        val result = solution.longestPalindrome(s)
        assertEquals(expected, result)
    }


    @Test
    fun testLongestPalindromeAllSameCharacters() {
        val s = "ccc"
        val expected = "ccc"
        val result = solution.longestPalindrome(s)
        assertEquals(expected, result)
    }
}