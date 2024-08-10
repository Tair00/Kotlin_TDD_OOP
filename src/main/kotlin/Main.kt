fun main() {
        val grid1 = arrayOf(" /", "/ ")
        val grid2 = arrayOf(" /", "  ")
        val grid3 = arrayOf("/\\", "\\/")

        val solution = Solution()

        println("Number of regions in grid1: " + solution.regionsBySlashes(grid1)) // Ожидаемый результат: 2
        println("Number of regions in grid2: " + solution.regionsBySlashes(grid2)) // Ожидаемый результат: 1
        println("Number of regions in grid3: " + solution.regionsBySlashes(grid3)) // Ожидаемый результат: 5
}
