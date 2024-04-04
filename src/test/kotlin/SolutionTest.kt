import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test



class SolutionTest {
    private val solution = Solution()

    @Test
    fun testReverse() {
        // Положительные числа
        assertEquals(321, solution.reverse(123))
        assertEquals(54321, solution.reverse(12345))
        assertEquals(21, solution.reverse(120))

        // Отрицательные числа
        assertEquals(-321, solution.reverse(-123))
        assertEquals(-54321, solution.reverse(-12345))

        // Особые случаи
        assertEquals(0, solution.reverse(0))
        assertEquals(0, solution.reverse(1534236469)) // Превышение максимального значения
        assertEquals(0, solution.reverse(-2147483648)) // Превышение минимального значения
    }
}
