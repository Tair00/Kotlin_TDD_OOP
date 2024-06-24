class Solution {
    fun minKBitFlips(nums: IntArray, k: Int): Int {
        val n = nums.size
        val flipIndicator = IntArray(n)
        var flips = 0
        var flipCount = 0

        for (i in nums.indices) {
            if (i >= k) {
                flipCount = flipCount xor flipIndicator[i - k]
            }

            if (flipCount % 2 == nums[i]) {
                if (i + k > n) {
                    return -1
                }

                flips++
                flipCount = flipCount xor 1
                flipIndicator[i] = 1
            }
        }
        return flips
    }
}
