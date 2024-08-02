fun main() {
        val solution = Solution()
        val nums1 = intArrayOf(0, 1, 0, 1, 1, 0, 0)
        println(solution.minSwaps(nums1)) // Ожидаемый результат: 1

        val nums2 = intArrayOf(0, 1, 1, 1, 0, 0, 1, 1, 0)
        println(solution.minSwaps(nums2)) // Ожидаемый результат: 2

        val nums3 = intArrayOf(1, 1, 0, 0, 1)
        println(solution.minSwaps(nums3)) // Ожидаемый результат: 0
}
