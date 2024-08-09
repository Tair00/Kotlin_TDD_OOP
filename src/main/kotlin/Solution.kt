class Solution {
    fun numMagicSquaresInside(grid: Array<IntArray>): Int {
        var count = 0

        // Проходим по всем возможным подмассивам 3x3
        for (i in 0..grid.size - 3) {
            for (j in 0..grid[0].size - 3) {
                if (isMagicSquare(grid, i, j)) {
                    count++
                }
            }
        }

        return count
    }

    private fun isMagicSquare(grid: Array<IntArray>, row: Int, col: Int): Boolean {
        // Проверка, что все элементы от 1 до 9
        val values = mutableSetOf<Int>()
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                val value = grid[row + i][col + j]
                if (value < 1 || value > 9 || !values.add(value)) {
                    return false
                }
            }
        }

        // Проверка суммы строк, столбцов и диагоналей
        val sum1 = grid[row][col] + grid[row][col + 1] + grid[row][col + 2]
        val sum2 = grid[row + 1][col] + grid[row + 1][col + 1] + grid[row + 1][col + 2]
        val sum3 = grid[row + 2][col] + grid[row + 2][col + 1] + grid[row + 2][col + 2]

        val sum4 = grid[row][col] + grid[row + 1][col] + grid[row + 2][col]
        val sum5 = grid[row][col + 1] + grid[row + 1][col + 1] + grid[row + 2][col + 1]
        val sum6 = grid[row][col + 2] + grid[row + 1][col + 2] + grid[row + 2][col + 2]

        val diag1 = grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2]
        val diag2 = grid[row][col + 2] + grid[row + 1][col + 1] + grid[row + 2][col]

        return sum1 == 15 && sum2 == 15 && sum3 == 15 &&
                sum4 == 15 && sum5 == 15 && sum6 == 15 &&
                diag1 == 15 && diag2 == 15
    }
}
