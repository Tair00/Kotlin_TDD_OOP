fun main() {
    val solution = Solution()

    // Пример 1
    val grid1 = arrayOf(
        intArrayOf(2, 4, 3, 5),
        intArrayOf(5, 4, 9, 3),
        intArrayOf(3, 4, 2, 11),
        intArrayOf(10, 9, 13, 15)
    )
    println("Maximum moves for grid1: ${solution.maxMoves(grid1)}")  // Ожидаемый вывод: 3

    // Пример 2
    val grid2 = arrayOf(
        intArrayOf(3, 2, 4),
        intArrayOf(2, 1, 9),
        intArrayOf(1, 1, 7)
    )
    println("Maximum moves for grid2: ${solution.maxMoves(grid2)}")  // Ожидаемый вывод: 0
}