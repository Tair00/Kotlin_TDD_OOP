class Solution {
    fun maxDistance(arrays: List<List<Int>>): Int {
        var maxDist = 0
        var minVal = arrays[0][0]
        var maxVal = arrays[0][arrays[0].size - 1]

        for (i in 1 until arrays.size) {
            val currentMin = arrays[i][0]
            val currentMax = arrays[i][arrays[i].size - 1]

            // Calculate the possible distances
            maxDist = maxOf(maxDist, Math.abs(currentMax - minVal), Math.abs(maxVal - currentMin))

            // Update the global min and max
            minVal = minOf(minVal, currentMin)
            maxVal = maxOf(maxVal, currentMax)
        }

        return maxDist
    }
}
