class Solution {
    fun minDifference(nums: IntArray): Int {
        if (nums.size <= 4) return 0

        nums.sort()

        var minDifference = Int.MAX_VALUE
        val n = nums.size


        minDifference = minOf(minDifference, nums[n - 1] - nums[3])
        minDifference = minOf(minDifference, nums[n - 2] - nums[2])
        minDifference = minOf(minDifference, nums[n - 3] - nums[1])
        minDifference = minOf(minDifference, nums[n - 4] - nums[0])
        return minDifference
    }
}