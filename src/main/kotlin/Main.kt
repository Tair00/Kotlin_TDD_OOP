fun main() {
    val solution = Solution()

    val testCase1 = intArrayOf(2, 6, 4, 1)
    val result1 = solution.threeConsecutiveOdds(testCase1)
    println("Test Case 1: $result1")  // Output: false

    val testCase2 = intArrayOf(1, 2, 34, 3, 4, 5, 7, 23, 12)
    val result2 = solution.threeConsecutiveOdds(testCase2)
    println("Test Case 2: $result2")  // Output: true

}