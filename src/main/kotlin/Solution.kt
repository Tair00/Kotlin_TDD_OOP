class Solution {
    fun getMaximumXor(nums: IntArray, maximumBit: Int): IntArray {
        val n = nums.size
        val maxNum = (1 shl maximumBit) - 1
        val answer = IntArray(n)
        var xorAll = 0

        for (num in nums) {
            xorAll = xorAll xor num
        }

        for (i in 0 until n) {
            answer[i] = xorAll xor maxNum
            xorAll = xorAll xor nums[n - 1 - i]
        }

        return answer
    }
}
