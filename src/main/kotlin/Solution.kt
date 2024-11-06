class Solution {
    fun canSortArray(nums: IntArray): Boolean {
        var prevSetBits = -1
        var prevMax = Int.MIN_VALUE
        var currMax = Int.MIN_VALUE
        var currMin = Int.MAX_VALUE

        for (num in nums) {
            val setBits = Integer.bitCount(num)
            if (setBits != prevSetBits) {
                if (prevMax > currMin) {
                    return false            }
                prevSetBits = setBits
                prevMax = currMax
                currMax = num
                currMin = num
            } else {
                currMax = maxOf(currMax, num)
                currMin = minOf(currMin, num)
            }
        }

        return prevMax <= currMin
    }
}
