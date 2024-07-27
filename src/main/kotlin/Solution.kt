import java.util.*

class Solution {
    fun minimumCost(source: String, target: String, original: CharArray, changed: CharArray, cost: IntArray): Long {
        val n = source.length

        // Step 1: Build the graph with costs.
        val graph = Array(26) { mutableListOf<Pair<Int, Int>>() }
        for (i in original.indices) {
            val u = original[i] - 'a'
            val v = changed[i] - 'a'
            val w = cost[i]
            graph[u].add(Pair(v, w))
        }

        // Step 2: Dijkstra's Algorithm to find minimum cost from each character to each other character.
        val minCost = Array(26) { IntArray(26) { Int.MAX_VALUE } }

        fun dijkstra(start: Int) {
            val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
            pq.add(Pair(start, 0))
            minCost[start][start] = 0

            while (pq.isNotEmpty()) {
                val (u, currCost) = pq.poll()

                if (currCost > minCost[start][u]) continue

                for ((v, weight) in graph[u]) {
                    val newCost = currCost + weight
                    if (newCost < minCost[start][v]) {
                        minCost[start][v] = newCost
                        pq.add(Pair(v, newCost))
                    }
                }
            }
        }

        for (i in 0 until 26) {
            dijkstra(i)
        }

        // Step 3: Calculate the minimum cost to transform source to target.
        var totalCost = 0L
        for (i in 0 until n) {
            val u = source[i] - 'a'
            val v = target[i] - 'a'
            if (u == v) continue
            if (minCost[u][v] == Int.MAX_VALUE) return -1
            totalCost += minCost[u][v]
        }

        return totalCost
    }
}
