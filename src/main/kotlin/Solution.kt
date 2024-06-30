class Solution {
    private class UnionFind(val size: Int) {
        private val parent = IntArray(size) { it }
        private val rank = IntArray(size) { 1 }

        fun find(x: Int): Int {
            if (parent[x] != x) {
                parent[x] = find(parent[x])
            }
            return parent[x]
        }

        fun union(x: Int, y: Int): Boolean {
            val rootX = find(x)
            val rootY = find(y)
            if (rootX != rootY) {
                if (rank[rootX] > rank[rootY]) {
                    parent[rootY] = rootX
                } else if (rank[rootX] < rank[rootY]) {
                    parent[rootX] = rootY
                } else {
                    parent[rootY] = rootX
                    rank[rootX]++
                }
                return true
            }
            return false
        }

        fun isConnected(): Boolean {
            val root = find(0)
            for (i in 1 until size) {
                if (find(i) != root) return false
            }
            return true
        }
    }

    fun maxNumEdgesToRemove(n: Int, edges: Array<IntArray>): Int {
        val ufAlice = UnionFind(n)
        val ufBob = UnionFind(n)
        var edgesUsed = 0

        for (edge in edges) {
            if (edge[0] == 3) {
                if (ufAlice.union(edge[1] - 1, edge[2] - 1)) {
                    ufBob.union(edge[1] - 1, edge[2] - 1)
                    edgesUsed++
                }
            }
        }

        for (edge in edges) {
            when (edge[0]) {
                1 -> if (ufAlice.union(edge[1] - 1, edge[2] - 1)) edgesUsed++
                2 -> if (ufBob.union(edge[1] - 1, edge[2] - 1)) edgesUsed++
            }
        }


        if (ufAlice.isConnected() && ufBob.isConnected()) {
            return edges.size - edgesUsed
        }
        return -1
    }
}