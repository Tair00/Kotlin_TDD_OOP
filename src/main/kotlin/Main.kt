fun main() {
        val grid1 = arrayOf(
                intArrayOf(1,1,1,0,0),
                intArrayOf(0,1,1,1,1),
                intArrayOf(0,0,0,0,0),
                intArrayOf(1,0,0,0,0),
                intArrayOf(1,1,0,1,1)
        )
        val grid2 = arrayOf(
                intArrayOf(1,1,1,0,0),
                intArrayOf(0,0,1,1,1),
                intArrayOf(0,1,0,0,0),
                intArrayOf(1,0,1,1,0),
                intArrayOf(0,1,0,1,0)
        )

        val solution = Solution()
        val result = solution.countSubIslands(grid1, grid2)
        println("Number of sub-islands: $result") // Output: 3
}
