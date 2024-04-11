import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test



class SolutionTest {
    private val solution = Solution()

    @Test
    fun testMyAtoiExample1() {
        val s = "42"
        val expected = 42
        val result = solution.myAtoi(s)
        assertEquals(expected, result)
    }

    @Test
    fun testMyAtoiExample2() {
        val s = "-42"
        val expected = -42
        val result = solution.myAtoi(s)
        assertEquals(expected, result)
    }

    @Test
    fun testMyAtoiExample3() {
        val s = "4193 with words"
        val expected = 4193
        val result = solution.myAtoi(s)
        assertEquals(expected, result)
    }

    @Test
    fun testMyAtoiExample4() {
        val s = "words and 987"
        val expected = 0
        val result = solution.myAtoi(s)
        assertEquals(expected, result)
    }

    @Test
    fun testMyAtoiExample5() {
        val s = "-91283472332"
        val expected = -2147483648 // INT_MIN
        val result = solution.myAtoi(s)
        assertEquals(expected, result)
    }

    @Test
    fun testMyAtoiLeadingSpaces() {
        val s = "   -42"
        val expected = -42
        val result = solution.myAtoi(s)
        assertEquals(expected, result)
    }
}