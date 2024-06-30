fun main() {
    val solution = Solution()
    val n = 4
    val edges = arrayOf(
        intArrayOf(3, 1, 2), intArrayOf(3, 2, 3), intArrayOf(1, 1, 3),
        intArrayOf(1, 2, 4), intArrayOf(1, 3, 4), intArrayOf(2, 1, 4)
    )
    val result = solution.maxNumEdgesToRemove(n, edges)
    println("Максимальное количество удалённых рёбер: $result")
}