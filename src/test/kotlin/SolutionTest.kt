import org.junit.Assert
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test






class SolutionTest {
    @Test
    fun testIntToRoman() {
        val solution = Solution()


        assertEquals("MMMDCCXLIX", solution.intToRoman(3749))

        assertEquals("LVIII", solution.intToRoman(58))

        assertEquals("MCMXCIV", solution.intToRoman(1994))

        assertEquals("III", solution.intToRoman(3))
        assertEquals("CDXLIV", solution.intToRoman(444))
    }
}
