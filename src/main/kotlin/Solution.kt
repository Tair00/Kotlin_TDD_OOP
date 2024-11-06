class Solution {
    fun canSortArray(nums: IntArray): Boolean {

        val groupedBySetBits = nums.groupBy { Integer.bitCount(it) }

        val sortedGrouped = groupedBySetBits.values.flatMap { it.sorted() }

        return sortedGrouped == nums.sorted()
    }
}
