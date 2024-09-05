fun main() {
        val solution = Solution()

        // Example 1
        val rolls1 = intArrayOf(3, 2, 4, 3)
        val mean1 = 4
        val n1 = 2
        val result1 = solution.missingRolls(rolls1, mean1, n1)
        println("Example 1 result: ${result1.joinToString(", ")}")

        val rolls2 = intArrayOf(1, 5, 6)
        val mean2 = 3
        val n2 = 4
        val result2 = solution.missingRolls(rolls2, mean2, n2)
        println("Example 2 result: ${result2.joinToString(", ")}")

        val rolls3 = intArrayOf(1, 2, 3, 4)
        val mean3 = 6
        val n3 = 4
        val result3 = solution.missingRolls(rolls3, mean3, n3)
        println("Example 3 result: ${result3.joinToString(", ")}")
}
