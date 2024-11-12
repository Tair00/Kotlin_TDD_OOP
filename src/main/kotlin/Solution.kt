class Solution {
    fun maximumBeauty(items: Array<IntArray>, queries: IntArray): IntArray {

        items.sortWith(compareBy({ it[0] }, { it[1] }))

        val maxBeautyUpToPrice = mutableListOf<Pair<Int, Int>>()
        var currentMaxBeauty = 0
        for (item in items) {
            val price = item[0]
            val beauty = item[1]
            currentMaxBeauty = maxOf(currentMaxBeauty, beauty)
            maxBeautyUpToPrice.add(Pair(price, currentMaxBeauty))
        }

        val sortedQueries = queries.withIndex().sortedBy { it.value }
        val result = IntArray(queries.size)
        var i = 0
        for ((index, query) in sortedQueries) {
            while (i < maxBeautyUpToPrice.size && maxBeautyUpToPrice[i].first <= query) {
                i++
            }
            result[index] = if (i > 0) maxBeautyUpToPrice[i - 1].second else 0
        }

        return result
    }
}
