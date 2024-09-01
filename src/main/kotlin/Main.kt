fun main() {
        val solution = Solution()

        // Example 1
        val original1 = intArrayOf(1, 2, 3, 4)
        val m1 = 2
        val n1 = 2
        val result1 = solution.construct2DArray(original1, m1, n1)
        println(result1.contentDeepToString())  // Output: [[1, 2], [3, 4]]

        // Example 2
        val original2 = intArrayOf(1, 2, 3)
        val m2 = 1
        val n2 = 3
        val result2 = solution.construct2DArray(original2, m2, n2)
        println(result2.contentDeepToString())  // Output: [[1, 2, 3]]

        // Example 3
        val original3 = intArrayOf(1, 2)
        val m3 = 1
        val n3 = 1
        val result3 = solution.construct2DArray(original3, m3, n3)
        println(result3.contentDeepToString())  // Output: []
}
