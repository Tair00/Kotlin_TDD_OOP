fun main() {
    val solution = Solution()
    val nums1 = intArrayOf(1, 2, 3)
    println(solution.subsets(nums1)) // Output: [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]

    val nums2 = intArrayOf(0)
    println(solution.subsets(nums2)) // Output: [[], [0]]
}