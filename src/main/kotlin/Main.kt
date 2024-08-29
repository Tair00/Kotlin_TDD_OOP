fun main() {
        val solution = Solution()

        // Example 1
        val stones1 = arrayOf(
                intArrayOf(0, 0),
                intArrayOf(0, 1),
                intArrayOf(1, 0),
                intArrayOf(1, 2),
                intArrayOf(2, 1),
                intArrayOf(2, 2)
        )
        val result1 = solution.removeStones(stones1)
        println("Output for stones1: $result1")  // Expected Output: 5

        // Example 2
        val stones2 = arrayOf(
                intArrayOf(0, 0),
                intArrayOf(0, 2),
                intArrayOf(1, 1),
                intArrayOf(2, 0),
                intArrayOf(2, 2)
        )
        val result2 = solution.removeStones(stones2)
        println("Output for stones2: $result2")  // Expected Output: 3

        // Example 3
        val stones3 = arrayOf(
                intArrayOf(0, 0)
        )
        val result3 = solution.removeStones(stones3)
        println("Output for stones3: $result3")  // Expected Output: 0
}
