import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test



class SolutionTest {
    @Test
    fun test1() {
        val solution = Solution()
        val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
        val expected = listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))
        val result = solution.threeSum(nums)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val solution = Solution()
        val nums = intArrayOf(0, 1, 1)
        val expected = emptyList<List<Int>>()
        val result = solution.threeSum(nums)
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val solution = Solution()
        val nums = intArrayOf(0, 0, 0)
        val expected = listOf(listOf(0, 0, 0))
        val result = solution.threeSum(nums)
        assertEquals(expected, result)
    }

}