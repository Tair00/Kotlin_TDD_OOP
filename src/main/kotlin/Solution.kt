class Solution {
    fun minPatches(nums: IntArray, n: Int): Int {
        var patches = 0
        var currentRange = 1L
        var i = 0

        while (currentRange <= n) {
            if (i < nums.size && nums[i] <= currentRange) {
                currentRange += nums[i]
                i++
            } else {
                currentRange += currentRange
                patches++
            }
        }

        return patches
    }
}
