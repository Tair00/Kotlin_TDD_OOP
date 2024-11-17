fun main() {
    val solution = Solution()

    // Test case 1
    val nums = intArrayOf(1)
    val k = 1
    println(Solution().shortestSubarray(nums, k)) // Output: 1


    val nums1 = intArrayOf(1, 2)
    val a = 4
    println(Solution().shortestSubarray(nums, a)) // Output: -1

    val nums2 = intArrayOf(2, -1, 2)
    val b = 3
    println(Solution().shortestSubarray(nums, b)) // Output: 3

}
