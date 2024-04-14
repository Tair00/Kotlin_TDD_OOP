import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test



class SolutionTest {
    @Test
    fun test1() {
        val solution = Solution()
        val nums = intArrayOf(-1, 2, 1, -4)
        val target = 1
        val expected = 2
        assertEquals(expected, solution.threeSumClosest(nums, target))
    }

    @Test
    fun test2() {
        val solution = Solution()
        val nums = intArrayOf(0, 0, 0)
        val target = 1
        val expected = 0
        assertEquals(expected, solution.threeSumClosest(nums, target))
    }

    @Test
    fun test3() {
        val solution = Solution()
        val nums = intArrayOf(1, 1, 1, 0)
        val target = -100
        val expected = 2
        assertEquals(expected, solution.threeSumClosest(nums, target))
    }

    @Test
    fun test4() {
        val solution = Solution()
        val nums = intArrayOf(-1, 2, 1, -4, 5, 6, 8)
        val target = 2
        val expected = 2
        assertEquals(expected, solution.threeSumClosest(nums, target))
    }
}