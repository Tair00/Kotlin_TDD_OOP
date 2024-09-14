class Solution {
    fun longestSubarray(nums: IntArray): Int {

        val maxVal = nums.maxOrNull() ?: return 0

        var maxLength = 0
        var currentLength = 0

            for (num in nums) {
            if (num == maxVal) {
                currentLength++
                maxLength = kotlin.math.max(maxLength, currentLength)
            } else {
                currentLength = 0
            }
        }

        return maxLength
    }
}
