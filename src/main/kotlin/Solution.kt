class Solution {
    fun findMinDifference(timePoints: List<String>): Int {

        val minutesList = timePoints.map { time ->
            val (hours, minutes) = time.split(":").map { it.toInt() }
            hours * 60 + minutes
        }.sorted()

        var minDifference = Int.MAX_VALUE

        for (i in 1 until minutesList.size) {
            minDifference = minOf(minDifference, minutesList[i] - minutesList[i - 1])
        }

        val wrapAroundDifference = 1440 + minutesList[0] - minutesList.last()

        return minOf(minDifference, wrapAroundDifference)
    }
}
