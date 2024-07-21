class Solution {
    fun buildMatrix(k: Int, rowConditions: Array<IntArray>, colConditions: Array<IntArray>): Array<IntArray> {
        val rowOrder = topologicalSort(k, rowConditions)
        val colOrder = topologicalSort(k, colConditions)

        if (rowOrder.isEmpty() || colOrder.isEmpty()) {
            return arrayOf()
        }

        val matrix = Array(k) { IntArray(k) }
        val position = Array(k + 1) { IntArray(2) }

        for (i in rowOrder.indices) {
            position[rowOrder[i]][0] = i
        }

        for (i in colOrder.indices) {
            position[colOrder[i]][1] = i
        }

        for (i in 1..k) {
            matrix[position[i][0]][position[i][1]] = i
        }

        return matrix
    }

    private fun topologicalSort(k: Int, conditions: Array<IntArray>): List<Int> {
        val graph = Array(k + 1) { mutableListOf<Int>() }
        val inDegree = IntArray(k + 1)

        for (condition in conditions) {
            val u = condition[0]
            val v = condition[1]
            graph[u].add(v)
            inDegree[v]++
        }

        val queue = ArrayDeque<Int>()
        for (i in 1..k) {
            if (inDegree[i] == 0) {
                queue.add(i)
            }
        }

        val order = mutableListOf<Int>()
        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()
            order.add(node)
            for (neighbor in graph[node]) {
                inDegree[neighbor]--
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor)
                }
            }
        }

        return if (order.size == k) order else emptyList()
    }
}
