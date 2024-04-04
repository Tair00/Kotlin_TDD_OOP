import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testLengthOfLongestSubstring() {


            @Test
            fun testIsPalindrome() {

                assertEquals(true, solution.isPalindrome(0))
                assertEquals(true, solution.isPalindrome(121))
                assertEquals(true, solution.isPalindrome(12321))
                assertEquals(true, solution.isPalindrome(1234321))


                assertEquals(false, solution.isPalindrome(-121))
                assertEquals(false, solution.isPalindrome(10))
                assertEquals(false, solution.isPalindrome(123456))
                assertEquals(false, solution.isPalindrome(12345678))
            }
        }

    }