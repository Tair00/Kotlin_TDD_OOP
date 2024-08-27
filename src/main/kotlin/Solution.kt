import java.util.*

class Solution {
    fun maxProbability(n: Int, edges: Array<IntArray>, succProb: DoubleArray, start_node: Int, end_node: Int): Double {

        val graph = Array(n) { mutableListOf<Pair<Int, Double>>() }
        for (i in edges.indices) {
            val (u, v) = edges[i]
            val prob = succProb[i]
            graph[u].add(Pair(v, prob))
            graph[v].add(Pair(u, prob))
        }

        val maxProb = DoubleArray(n) { 0.0 }
        maxProb[start_node] = 1.0
        val pq = PriorityQueue<Pair<Int, Double>>(compareByDescending { it.second })
        pq.add(Pair(start_node, 1.0))


        while (pq.isNotEmpty()) {
            val (currentNode, currentProb) = pq.poll()

            if (currentNode == end_node) return currentProb

            for ((neighbor, prob) in graph[currentNode]) {
                val newProb = currentProb * prob
                if (newProb > maxProb[neighbor]) {
                    maxProb[neighbor] = newProb
                    pq.add(Pair(neighbor, newProb))
                }
            }
        }

        return 0.0
    }
}