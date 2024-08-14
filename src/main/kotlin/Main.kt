fun main() {

        val solution = Solution()

        // Пример 1: nums = [1, 3, 1], k = 1
        val nums1 = intArrayOf(1, 3, 1)
        val k1 = 1
        val result1 = solution.smallestDistancePair(nums1, k1)
        println("The ${k1}st smallest distance in nums1 is: $result1")
        // Ожидаемый результат: 0

        // Пример 2: nums = [1, 1, 1], k = 2
        val nums2 = intArrayOf(1, 1, 1)
        val k2 = 2
        val result2 = solution.smallestDistancePair(nums2, k2)
        println("The ${k2}nd smallest distance in nums2 is: $result2")
        // Ожидаемый результат: 0

        // Пример 3: nums = [1, 6, 1], k = 3
        val nums3 = intArrayOf(1, 6, 1)
        val k3 = 3
        val result3 = solution.smallestDistancePair(nums3, k3)
        println("The ${k3}rd smallest distance in nums3 is: $result3")
        // Ожидаемый результат: 5
}
