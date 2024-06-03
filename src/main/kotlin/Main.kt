fun main() {
    val solution = Solution()

    val nums1 = intArrayOf(1, 3, 5, 6)
    val target1 = 5
    println("Индекс для вставки $target1 в массив ${nums1.joinToString(", ")}: ${solution.searchInsert(nums1, target1)}") // Ожидается: 2

    val nums2 = intArrayOf(1, 3, 5, 6)
    val target2 = 2
    println("Индекс для вставки $target2 в массив ${nums2.joinToString(", ")}: ${solution.searchInsert(nums2, target2)}") // Ожидается: 1

    val nums3 = intArrayOf(1, 3, 5, 6)
    val target3 = 7
    println("Индекс для вставки $target3 в массив ${nums3.joinToString(", ")}: ${solution.searchInsert(nums3, target3)}") // Ожидается: 4
}