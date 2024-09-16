fun main() {
    val solution = Solution()

    // Пример 1
    val timePoints1 = listOf("23:59", "00:00")
    val result1 = solution.findMinDifference(timePoints1)
    println("Минимальная разница для timePoints1: $result1")  // Ожидаемый результат: 1

    // Пример 2
    val timePoints2 = listOf("00:00", "23:59", "00:00")
    val result2 = solution.findMinDifference(timePoints2)
    println("Минимальная разница для timePoints2: $result2")  // Ожидаемый результат: 0
}
