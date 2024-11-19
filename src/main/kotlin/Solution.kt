class Solution {
    fun maximumSubarraySum(nums: IntArray, k: Int): Long {
        var maxSum = 0L
        var currentSum = 0L
        val seen = mutableSetOf<Int>()
        var left = 0

        for (right in nums.indices) {

            while (seen.contains(nums[right])) {
                  currentSum -= nums[left]
                seen.remove(nums[left])
                left++
            }

            seen.add(nums[right])
            currentSum += nums[right]
  if (right - left + 1 == k) {
                maxSum = maxOf(maxSum, currentSum)
      currentSum -= nums[left]
                seen.remove(nums[left])
                left++
            }
        }

        return maxSum
    }
}
