fun main() {
    val solution = Solution()

    // Пример входных данных
    val n = 5
    val edges = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(1, 3),
        intArrayOf(2, 4),
        intArrayOf(3, 4),
        intArrayOf(4, 5)
    )
    val time = 3
    val change = 5

    // Вызов метода secondMinimum
    val result = solution.secondMinimum(n, edges, time, change)

    // Вывод результата
    println("Второе минимальное время: $result")
}
