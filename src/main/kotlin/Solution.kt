import java.util.PriorityQueue

class Solution {
    data class State(val node: Int, val time: Int): Comparable<State> {
        override fun compareTo(other: State): Int = this.time - other.time
    }

    fun secondMinimum(n: Int, edges: Array<IntArray>, time: Int, change: Int): Int {
        val graph = Array(n + 1) { mutableListOf<Int>() }
        for (edge in edges) {
            graph[edge[0]].add(edge[1])
            graph[edge[1]].add(edge[0])
        }

        val arrivalTimes = Array(n + 1) { IntArray(2) { Int.MAX_VALUE } }
        arrivalTimes[1][0] = 0

        val pq = PriorityQueue<State>()
        pq.add(State(1, 0))

        while (pq.isNotEmpty()) {
            val (node, currentTime) = pq.poll()

            for (neighbor in graph[node]) {
                var travelTime = currentTime
                if ((travelTime / change) % 2 == 1) {
                    travelTime += change - (travelTime % change)
                }
                travelTime += time

                if (travelTime < arrivalTimes[neighbor][0]) {
                    arrivalTimes[neighbor][1] = arrivalTimes[neighbor][0]
                    arrivalTimes[neighbor][0] = travelTime
                    pq.add(State(neighbor, travelTime))
                } else if (travelTime > arrivalTimes[neighbor][0] && travelTime < arrivalTimes[neighbor][1]) {
                    arrivalTimes[neighbor][1] = travelTime
                    pq.add(State(neighbor, travelTime))
                }
            }
        }

        return if (arrivalTimes[n][1] == Int.MAX_VALUE) -1 else arrivalTimes[n][1]
    }
}
