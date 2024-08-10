class Solution {
    private lateinit var parent: IntArray

    private fun find(x: Int): Int {
        if (parent[x] != x) {
            parent[x] = find(parent[x])
        }
        return parent[x]
    }

    private fun union(x: Int, y: Int) {
        val rootX = find(x)
        val rootY = find(y)
        if (rootX != rootY) {
            parent[rootY] = rootX
        }
    }

    fun regionsBySlashes(grid: Array<String>): Int {
        val n = grid.size
        val size = 4 * n * n
        parent = IntArray(size) { it }

        for (i in 0 until n) {
            for (j in 0 until n) {
                val root = 4 * (i * n + j)
                val value = grid[i][j]

                // Union the parts of the current cell
                if (value == '/') {
                    union(root, root + 3)
                    union(root + 1, root + 2)
                } else if (value == '\\') {
                    union(root, root + 1)
                    union(root + 2, root + 3)
                } else {
                    union(root, root + 1)
                    union(root + 1, root + 2)
                    union(root + 2, root + 3)
                }

                if (j + 1 < n) {
                    union(root + 1, 4 * (i * n + j + 1) + 3)
                }

                if (i + 1 < n) {
                    union(root + 2, 4 * ((i + 1) * n + j))
                }
            }
        }

        var regions = 0
        for (i in 0 until size) {
            if (find(i) == i) {
                regions++
            }
        }
        return regions
    }
}
