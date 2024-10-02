class Solution {
    fun arrayRankTransform(arr: IntArray): IntArray {

        val sortedUnique = arr.distinct().sorted()

        val rankMap = mutableMapOf<Int, Int>()
        for (i in sortedUnique.indices) {
            rankMap[sortedUnique[i]] = i + 1
        }
        return arr.map { rankMap[it]!! }.toIntArray()
    }
}
