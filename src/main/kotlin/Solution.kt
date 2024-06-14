class Solution {
    fun minIncrementForUnique(nums: IntArray): Int {

        nums.sort()


        var moves = 0
        var prev = nums[0]


        for (i in 1 until nums.size) {
            if (nums[i] <= prev) {
                moves += (prev + 1) - nums[i]
                prev += 1
            } else {
                prev = nums[i]
            }
        }

        return moves
    }
}
