fun main() {
    val solution = Solution()

    // Example 1
    val n1 = 6
    val quantities1 = intArrayOf(11, 6)
    println("Minimum possible x for Example 1: ${solution.minimizedMaximum(n1, quantities1)}")  // Expected output: 3

    // Example 2
    val n2 = 7
    val quantities2 = intArrayOf(15, 10, 10)
    println("Minimum possible x for Example 2: ${solution.minimizedMaximum(n2, quantities2)}")  // Expected output: 5

    // Example 3
    val n3 = 1
    val quantities3 = intArrayOf(100000)
    println("Minimum possible x for Example 3: ${solution.minimizedMaximum(n3, quantities3)}")  // Expected output: 100000
}
