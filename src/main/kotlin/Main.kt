fun main() {
        val solution = Solution()


        val grid1 = arrayOf(
                intArrayOf(0, 1, 1, 0),
                intArrayOf(0, 1, 1, 0),
                intArrayOf(0, 0, 0, 0)
        )
        println("Minimum days to disconnect grid1: " + solution.minDays(grid1)) // Ожидаемый результат: 2


        val grid2 = arrayOf(
                intArrayOf(1, 1)
        )
        println("Minimum days to disconnect grid2: " + solution.minDays(grid2)) // Ожидаемый результат: 2


        val grid3 = arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 1, 0),
                intArrayOf(0, 0, 0)
        )
        println("Minimum days to disconnect grid3: " + solution.minDays(grid3)) // Ожидаемый результат: 1


        val grid4 = arrayOf(
                intArrayOf(1, 0, 1),
                intArrayOf(0, 1, 0),
                intArrayOf(1, 0, 1)
        )
        println("Minimum days to disconnect grid4: " + solution.minDays(grid4)) // Ожидаемый результат: 1
}
