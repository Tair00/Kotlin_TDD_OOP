fun main() {
    val solution = Solution()

    val nums1 = intArrayOf(1, 2, 2)
    println("Минимальное количество ходов: " + solution.minIncrementForUnique(nums1))  // Ожидается: 1

    val nums2 = intArrayOf(3, 2, 1, 2, 1, 7)
    println("Минимальное количество ходов: " + solution.minIncrementForUnique(nums2))  // Ожидается: 6
}
