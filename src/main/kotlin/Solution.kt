class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val counts = mutableMapOf<Int, Int>()
        val result = mutableListOf<Int>()

        for (num in nums1) {
            counts[num] = counts.getOrDefault(num, 0) + 1
        }


        for (num in nums2) {
            if (counts.getOrDefault(num, 0) > 0) {
                result.add(num)
                counts[num] = counts[num]!! - 1
            }
        }

        return result.toIntArray()
    }
}
