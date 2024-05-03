import java.util.*

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var uniqueCount = 1
        var lastUniqueIndex = 0

        for (i in 1 until nums.size) {
            if (nums[i] != nums[lastUniqueIndex]) {
                lastUniqueIndex++
                nums[lastUniqueIndex] = nums[i]
                uniqueCount++
            }
        }

        return uniqueCount
    }
}