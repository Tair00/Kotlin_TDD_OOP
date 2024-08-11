class Solution {

    private fun isConnected(grid: Array<IntArray>): Boolean {
        val m = grid.size
        val n = grid[0].size
        val visited = Array(m) { BooleanArray(n) }

        fun dfs(x: Int, y: Int) {
            if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0 || visited[x][y]) return
            visited[x][y] = true
            dfs(x + 1, y)
            dfs(x - 1, y)
            dfs(x, y + 1)
            dfs(x, y - 1)
        }

        var found = false
        outer@ for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 1) {
                    dfs(i, j)
                    found = true
                    break@outer
                }
            }
        }

        if (!found) return false

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    return false
                }
            }
        }

        return true
    }

    fun minDays(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size

        if (!isConnected(grid)) {
            return 0
        }

        var landCells = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 1) {
                    landCells++
                }
            }
        }


        if (landCells == 1) {
            return 1
        }


        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0
                    if (!isConnected(grid)) {
                        return 1
                    }
                    grid[i][j] = 1
                }
            }
        }


        return 2
    }
}
