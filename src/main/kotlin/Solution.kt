class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        nums.sort()
        var closestSum = nums[0] + nums[1] + nums[2]

        for (i in nums.indices) {
            var left = i + 1
            var right = nums.size - 1

            while (left < right) {
                val sum = nums[i] + nums[left] + nums[right]

                if (sum == target) {
                    return sum
                }

                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum
                }

                if (sum < target) {
                    left++
                } else {
                    right--
                }
            }
        }

        return closestSum
    }
}
