import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test



class SolutionTest {

    @Test
    fun testExample1() {
        val solution = Solution()
        val input = "PAYPALISHIRING"
        val numRows = 3
        val expectedOutput = "PAHNAPLSIIGYIR"
        assertEquals(expectedOutput, solution.convert(input, numRows))
    }

    @Test
    fun testExample2() {
        val solution = Solution()
        val input = "PAYPALISHIRING"
        val numRows = 4
        val expectedOutput = "PINALSIGYAHRPI"
        assertEquals(expectedOutput, solution.convert(input, numRows))
    }

    @Test
    fun testExample3() {
        val solution = Solution()
        val input = "A"
        val numRows = 1
        val expectedOutput = "A"
        assertEquals(expectedOutput, solution.convert(input, numRows))
    }

    @Test
    fun testEmptyString() {
        val solution = Solution()
        val input = ""
        val numRows = 3
        val expectedOutput = ""
        assertEquals(expectedOutput, solution.convert(input, numRows))
    }

    @Test
    fun testSingleRow() {
        val solution = Solution()
        val input = "HELLO"
        val numRows = 1
        val expectedOutput = "HELLO"
        assertEquals(expectedOutput, solution.convert(input, numRows))
    }

}
