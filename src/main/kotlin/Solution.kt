import java.util.*

class Solution {
    fun findMaximizedCapital(k: Int, w: Int, profits: IntArray, capital: IntArray): Int {

        val minCapitalQueue = PriorityQueue<Pair<Int, Int>>(compareBy { it.first })

        val maxProfitQueue = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.second })


        for (i in profits.indices) {
            minCapitalQueue.offer(Pair(capital[i], profits[i]))
        }

        var availableCapital = w
        var projectsCompleted = 0

        while (projectsCompleted < k) {

            while (minCapitalQueue.isNotEmpty() && minCapitalQueue.peek().first <= availableCapital) {
                val project = minCapitalQueue.poll()
                maxProfitQueue.offer(project)
            }


            if (maxProfitQueue.isEmpty()) break


            val bestProject = maxProfitQueue.poll()
            availableCapital += bestProject.second
            projectsCompleted++
        }

        return availableCapital
    }
}