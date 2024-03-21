import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionKtTest {

    @Test
    fun testLongestPalindrome() {

        @Test
        fun testPivotWithValidInput() {
            assertEquals(6, pivotInteger(8))
        }

        @Test
        fun testPivotWithBoundaryInput() {
            assertEquals(1, pivotInteger(1))
        }

        @Test
        fun testPivotWithNoPivot() {
            assertEquals(-1, pivotInteger(4))
        }

        @Test
        fun testPivotWithLargeInput() {
            assertEquals(500, pivotInteger(1000))
        }
    }
}
