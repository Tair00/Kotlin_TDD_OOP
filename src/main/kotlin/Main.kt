// Example usage:
fun main() {

    val solution = Solution()
    val n = 5
    val roads = arrayOf(
        intArrayOf(0, 1),
        intArrayOf(0, 2),
        intArrayOf(1, 3),
        intArrayOf(2, 3),
        intArrayOf(2, 4)
    )
    val result = solution.maximumImportance(n, roads)
    println("Максимальная общая важность всех дорог: $result")
}