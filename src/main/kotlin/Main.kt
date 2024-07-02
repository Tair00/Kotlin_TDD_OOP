fun main() {
    val solution = Solution()
    val nums1 = intArrayOf(1, 2, 2, 1)
    val nums2 = intArrayOf(2, 2)
    val result = solution.intersect(nums1, nums2)
    println(result.joinToString(", "))  // Output: [2, 2]

    val nums3 = intArrayOf(4, 9, 5)
    val nums4 = intArrayOf(9, 4, 9, 8, 4)
    val result2 = solution.intersect(nums3, nums4)
    println(result2.joinToString(", "))  // Output: [4, 9]
}