fun main() {
    val positions = intArrayOf(10, 20, 30)
    val healths = intArrayOf(3, 2, 1)
    val directions = "RLR"
    val solution = Solution()
    val result = solution.survivedRobotsHealths(positions, healths, directions)
    println(result) // Вывод: [2]
}
