class Solution {
    fun smallestDistancePair(nums: IntArray, k: Int): Int {
        nums.sort()

        var low = 0
        var high = nums[nums.size - 1] - nums[0]

        while (low < high) {
            val mid = low + (high - low) / 2
            var count = 0
            var left = 0

            for (right in nums.indices) {
                while (nums[right] - nums[left] > mid) {
                    left++
                }
                count += right - left
            }

            if (count >= k) {
                high = mid
            } else {
                low = mid + 1
            }
        }

        return low
    }
}
