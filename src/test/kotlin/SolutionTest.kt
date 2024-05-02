import org.junit.Assert
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test






class SolutionTest {
    @Test
    fun testIntToRoman() {
        val solution = Solution()


        assertEquals(true, solution.isValid("{}"))
    }
}
