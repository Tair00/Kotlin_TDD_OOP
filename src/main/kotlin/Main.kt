fun main() {
    val solution = Solution()

    val seats1 = intArrayOf(3, 1, 5)
    val students1 = intArrayOf(2, 7, 4)
    println("Минимальное количество шагов: " + solution.minMovesToSeat(seats1, students1))  // Ожидается: 4

    val seats2 = intArrayOf(4, 1, 5, 9)
    val students2 = intArrayOf(1, 3, 2, 6)
    println("Минимальное количество шагов: " + solution.minMovesToSeat(seats2, students2))  // Ожидается: 7

    val seats3 = intArrayOf(2, 2, 6, 6)
    val students3 = intArrayOf(1, 3, 2, 6)
    println("Минимальное количество шагов: " + solution.minMovesToSeat(seats3, students3))  // Ожидается: 4
}
