class Solution {
    fun averageWaitingTime(customers: Array<IntArray>): Double {
        var currentTime = 0
        var totalWaitingTime = 0.0

        for (customer in customers) {
            val arrivalTime = customer[0]
            val preparationTime = customer[1]


            currentTime = maxOf(currentTime, arrivalTime)


            val finishTime = currentTime + preparationTime


            val waitingTime = finishTime - arrivalTime
            totalWaitingTime += waitingTime

            currentTime = finishTime
        }


        return totalWaitingTime / customers.size
    }
}