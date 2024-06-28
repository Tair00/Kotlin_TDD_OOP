class Solution {
    fun maximumImportance(n: Int, roads: Array<IntArray>): Long {

        val degree = IntArray(n)
        for (road in roads) {
            degree[road[0]]++
            degree[road[1]]++
        }

        val cities = degree.indices.sortedByDescending { degree[it] }

        val values = IntArray(n)
        for (i in cities.indices) {
            values[cities[i]] = n - i
        }

        var totalImportance = 0L
        for (road in roads) {
            totalImportance += (values[road[0]] + values[road[1]]).toLong()
        }

        return totalImportance
    }
}
