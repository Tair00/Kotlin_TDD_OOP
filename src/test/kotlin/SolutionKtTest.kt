import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionKtTest {

    private val solution = Solution()

    @Test
    fun testRomanToInt() {
        assertEquals(3, solution.romanToInt("III"))
        assertEquals(58, solution.romanToInt("LVIII"))
        assertEquals(1994, solution.romanToInt("MCMXCIV"))
    }

    @Test
    fun testEdgeCases() {
        assertEquals(1, solution.romanToInt("I"))
        assertEquals(3999, solution.romanToInt("MMMCMXCIX"))
        assertEquals(1000, solution.romanToInt("M"))
        assertEquals(10, solution.romanToInt("X"))
    }

    @Test
    fun testSubtractiveNotation() {
        assertEquals(4, solution.romanToInt("IV"))
        assertEquals(9, solution.romanToInt("IX"))
        assertEquals(40, solution.romanToInt("XL"))
        assertEquals(90, solution.romanToInt("XC"))
        assertEquals(400, solution.romanToInt("CD"))
        assertEquals(900, solution.romanToInt("CM"))
    }
}
