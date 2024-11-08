fun main() {
    // Example 1
    val nums1 = intArrayOf(0, 1, 1, 3)
    val maximumBit1 = 2
    val solution = Solution()
    println("Example 1 Output: " + solution.getMaximumXor(nums1, maximumBit1).contentToString())

    // Example 2
    val nums2 = intArrayOf(2, 3, 4, 7)
    val maximumBit2 = 3
    println("Example 2 Output: " + solution.getMaximumXor(nums2, maximumBit2).contentToString())

    // Example 3
    val nums3 = intArrayOf(0, 1, 2, 2, 5, 7)
    val maximumBit3 = 3
    println("Example 3 Output: " + solution.getMaximumXor(nums3, maximumBit3).contentToString())
}
