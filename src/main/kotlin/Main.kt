fun main() {
        val solution = Solution()
        val grid1 = arrayOf(
                intArrayOf(4, 3, 8, 4),
                intArrayOf(9, 5, 1, 9),
                intArrayOf(2, 7, 6, 2)
        )
        println(solution.numMagicSquaresInside(grid1))  // Ожидаемый результат: 1

        val grid2 = arrayOf(
                intArrayOf(8)
        )
        println(solution.numMagicSquaresInside(grid2))  // Ожидаемый результат: 0
}
