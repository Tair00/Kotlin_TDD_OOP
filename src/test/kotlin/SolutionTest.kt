import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test



class SolutionTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 5, 3, 9, 5, 3)
        val expected = 3
        assertEquals(expected, Solution().minimumAverageDifference(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0)
        val expected = 0
        assertEquals(expected, Solution().minimumAverageDifference(nums))
    }

}