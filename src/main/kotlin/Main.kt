fun main() {
        val solution = Solution()


        val nums1 = intArrayOf(1, 2, 3, 4)
        val n1 = nums1.size
        val left1 = 1
        val right1 = 5
        println(solution.rangeSum(nums1, n1, left1, right1)) // Ожидаемый результат: 13


        val nums2 = intArrayOf(1, 2, 3, 4)
        val n2 = nums2.size
        val left2 = 3
        val right2 = 4
        println(solution.rangeSum(nums2, n2, left2, right2)) // Ожидаемый результат: 6


        val nums3 = intArrayOf(1, 2, 3, 4)
        val n3 = nums3.size
        val left3 = 1
        val right3 = 10
        println(solution.rangeSum(nums3, n3, left3, right3)) // Ожидаемый результат: 50
}
