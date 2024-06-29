fun main() {
    val solution = Solution()
    val n = 8
    val edges = arrayOf(
        intArrayOf(0, 3), intArrayOf(0, 4), intArrayOf(1, 3),
        intArrayOf(2, 4), intArrayOf(2, 7), intArrayOf(3, 5),
        intArrayOf(3, 6), intArrayOf(3, 7), intArrayOf(4, 6)
    )
    val result = solution.getAncestors(n, edges)
    println("Результат: $result")
}
