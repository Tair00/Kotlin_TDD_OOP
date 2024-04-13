import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test



class SolutionTest {
    private val solution = Solution()

    @Test
    fun testMaxArea_Case1() {
        val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        val expected = 49
        val actual = solution.maxArea(height)
        assertEquals(expected, actual)
    }

    @Test
    fun testMaxArea_Case2() {
        val height = intArrayOf(1, 1)
        val expected = 1
        val actual = solution.maxArea(height)
        assertEquals(expected, actual)
    }

    @Test
    fun testMaxArea_Case3() {
        val height = intArrayOf(4, 3, 2, 1, 4)
        val expected = 16
        val actual = solution.maxArea(height)
        assertEquals(expected, actual)
    }

    @Test
    fun testMaxArea_Case4() {
        val height = intArrayOf(1, 2, 1)
        val expected = 2
        val actual = solution.maxArea(height)
        assertEquals(expected, actual)
    }

}