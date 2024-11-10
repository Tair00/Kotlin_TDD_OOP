class Solution {
    private val kMaxBit = 30

    fun minimumSubarrayLength(nums: IntArray, k: Int): Int {
        val kMax = 50
        val n = nums.size
        var ans = n + 1
        var ors = 0
        val count = IntArray(kMax + 1)

        var l = 0
        for (r in 0 until n) {
            ors = orNum(ors, nums[r], count)
            while (ors >= k && l <= r) {
                ans = minOf(ans, r - l + 1)
                ors = undoOrNum(ors, nums[l], count)
                l++
            }
        }

        return if (ans == n + 1) -1 else ans
    }

    private fun orNum(ors: Int, num: Int, count: IntArray): Int {
        var ors = ors
        for (i in 0 until kMaxBit) {
            if ((num shr i and 1) == 1 && ++count[i] == 1) {
                ors += 1 shl i
            }
        }
        return ors
    }

    private fun undoOrNum(ors: Int, num: Int, count: IntArray): Int {
        var ors = ors
        for (i in 0 until kMaxBit) {
            if ((num shr i and 1) == 1 && --count[i] == 0) {
                ors -= 1 shl i
            }
        }
        return ors
    }
}