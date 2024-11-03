fun main() {
    val solution = Solution()

    // Test cases
    val s1 = "abcde"
    val goal1 = "cdeab"
    println(solution.rotateString(s1, goal1)) // Output: true

    val s2 = "abcde"
    val goal2 = "abced"
    println(solution.rotateString(s2, goal2)) // Output: false
}
