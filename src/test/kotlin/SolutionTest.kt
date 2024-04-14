import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test



class SolutionTest {

    @Test
    fun test1() {
        val solution = Solution()
        val digits = "23"
        val expected = listOf("ad","ae","af","bd","be","bf","cd","ce","cf")
        assertEquals(expected, solution.letterCombinations(digits).sorted())
    }

    @Test
    fun test2() {
        val solution = Solution()
        val digits = ""
        val expected = emptyList<String>()
        assertEquals(expected, solution.letterCombinations(digits))
    }

    @Test
    fun test3() {
        val solution = Solution()
        val digits = "2"
        val expected = listOf("a","b","c")
        assertEquals(expected, solution.letterCombinations(digits).sorted())
    }

    @Test
    fun test4() {
        val solution = Solution()
        val digits = "79"
        val expected = listOf("pw", "px", "py", "pz", "qw", "qx", "qy", "qz", "rw", "rx", "ry", "rz", "sw", "sx", "sy", "sz")
        assertEquals(expected, solution.letterCombinations(digits).sorted())
    }
}