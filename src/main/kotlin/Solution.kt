class Solution {
    fun countSubIslands(grid1: Array<IntArray>, grid2: Array<IntArray>): Int {
        val rows = grid1.size
        val cols = grid1[0].size
        var subIslandCount = 0

        fun dfs(r: Int, c: Int): Boolean {
            if (r < 0 || r >= rows || c < 0 || c >= cols || grid2[r][c] == 0) {
                return true
            }

            grid2[r][c] = 0

            var isSubIsland = grid1[r][c] == 1


            isSubIsland = dfs(r + 1, c) && isSubIsland
            isSubIsland = dfs(r - 1, c) && isSubIsland
            isSubIsland = dfs(r, c + 1) && isSubIsland
            isSubIsland = dfs(r, c - 1) && isSubIsland

            return isSubIsland
        }

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                if (grid2[r][c] == 1) {
                    if (dfs(r, c)) {
                        subIslandCount++
                    }
                }
            }
        }

        return subIslandCount
    }
}
