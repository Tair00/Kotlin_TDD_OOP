fun main() {
    val solution = Solution()

    val nums1 = intArrayOf(1, 2, 3, 3, 2, 2)
    val result1 = solution.longestSubarray(nums1)
    println("Result for nums1: $result1") // Ожидаемый результат: 2

    val nums2 = intArrayOf(1, 2, 3, 4)
    val result2 = solution.longestSubarray(nums2)
    println("Result for nums2: $result2") // Ожидаемый результат: 1
}
