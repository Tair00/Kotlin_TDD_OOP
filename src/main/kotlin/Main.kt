fun main() {
    val solution = Solution()

    val nums1 = intArrayOf(5, 3, 2, 4)
    println(solution.minDifference(nums1))  // Output: 0

    val nums2 = intArrayOf(1, 5, 0, 10, 14)
    println(solution.minDifference(nums2))  // Output: 1

    val nums3 = intArrayOf(3, 100, 20)
    println(solution.minDifference(nums3))  // Output: 0
}