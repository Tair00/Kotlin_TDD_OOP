class Solution {
    fun removeStones(stones: Array<IntArray>): Int {
        val parent = mutableMapOf<Int, Int>()

        // Function to find the root (with path compression)
        fun find(x: Int): Int {
            if (parent.getOrDefault(x, x) != x) {
                parent[x] = find(parent[x]!!)
            }
            return parent.getOrDefault(x, x)
        }

        // Function to union two components
        fun union(x: Int, y: Int) {
            val rootX = find(x)
            val rootY = find(y)
            if (rootX != rootY) {
                parent[rootX] = rootY
            }
        }

        // Union stones by rows and columns
        for (stone in stones) {
            val x = stone[0] + 10000 // Shift to distinguish between row and column
            val y = stone[1]
            union(x, y)
        }

        // Count unique components
        val uniqueRoots = mutableSetOf<Int>()
        for (stone in stones) {
            val x = stone[0] + 10000
            uniqueRoots.add(find(x))
        }

        // Total stones minus the number of components
        return stones.size - uniqueRoots.size
    }
}
