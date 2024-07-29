fun main() {
    val solution = Solution()

    // Пример 1
    val rating1 = intArrayOf(2, 5, 3, 4, 1)
    println("Output for rating1: ${solution.numTeams(rating1)}")  // Ожидаемый результат: 3

    // Пример 2
    val rating2 = intArrayOf(2, 1, 3)
    println("Output for rating2: ${solution.numTeams(rating2)}")  // Ожидаемый результат: 0

    // Пример 3
    val rating3 = intArrayOf(1, 2, 3, 4)
    println("Output for rating3: ${solution.numTeams(rating3)}")  // Ожидаемый результат: 4
}