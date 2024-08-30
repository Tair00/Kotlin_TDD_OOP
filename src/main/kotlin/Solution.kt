class Solution {
    private val kMax = 2_000_000_000

    fun modifiedGraphEdges(n: Int, edges: Array<IntArray>, source: Int, destination: Int, target: Int): Array<IntArray> {
        val graph = Array(n) { mutableListOf<Pair<Int, Int>>() }

        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            val w = edge[2]
            if (w == -1) continue
            graph[u].add(Pair(v, w))
            graph[v].add(Pair(u, w))
        }

        var distToDestination = dijkstra(graph, source, destination)
        if (distToDestination < target) return emptyArray()
        if (distToDestination == target) {
            for (edge in edges) {
                if (edge[2] == -1) edge[2] = kMax
            }
            return edges
        }

        for (i in edges.indices) {
            val u = edges[i][0]
            val v = edges[i][1]
            var w = edges[i][2]
            if (w != -1) continue
            w = 1
            edges[i][2] = 1
            graph[u].add(Pair(v, 1))
            graph[v].add(Pair(u, 1))
            distToDestination = dijkstra(graph, source, destination)
            if (distToDestination <= target) {
                edges[i][2] += target - distToDestination
                for (j in i + 1 until edges.size) {
                    if (edges[j][2] == -1) edges[j][2] = kMax
                }
                return edges
            }
        }

        return emptyArray()
    }

    private fun dijkstra(graph: Array<MutableList<Pair<Int, Int>>>, src: Int, dst: Int): Int {
        val dist = IntArray(graph.size) { Int.MAX_VALUE }
        val minHeap = PriorityQueue<Pair<Int, Int>>(compareBy { it.first })

        dist[src] = 0
        minHeap.add(Pair(0, src))

        while (minHeap.isNotEmpty()) {
            val (d, u) = minHeap.poll()
            if (d > dist[u]) continue
            for ((v, w) in graph[u]) {
                if (d + w < dist[v]) {
                    dist[v] = d + w
                    minHeap.add(Pair(dist[v], v))
                }
            }
        }

        return dist[dst]
    }
}
