class Solution {
    fun maxMoves(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size

        val dp = Array(m) { IntArray(n) { -1 } }

        fun dfs(row: Int, col: Int): Int {
            if (col == n - 1) return 0
            if (dp[row][col] != -1) return dp[row][col]

            var maxMoves = 0
            val directions = arrayOf(-1, 0, 1)
            for (dir in directions) {
                val newRow = row + dir
                val newCol = col + 1
                if (newRow in 0 until m && newCol < n && grid[newRow][newCol] > grid[row][col]) {
                    maxMoves = maxOf(maxMoves, 1 + dfs(newRow, newCol))
                }
            }
            dp[row][col] = maxMoves
            return dp[row][col]
        }

        var maxResult = 0
        for (i in 0 until m) {
            maxResult = maxOf(maxResult, dfs(i, 0))
        }
        return maxResult
    }
}
