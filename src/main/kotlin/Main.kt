fun main() {
 val solution = Solution()

 // Примеры использования функции removeDuplicates с различными массивами
 val nums1 = intArrayOf(1, 1, 2)
 println(solution.removeDuplicates(nums1)) // Выведет 2
 println(nums1.contentToString()) // Выведет [1, 2, 2]

 val nums2 = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
 println(solution.removeDuplicates(nums2)) // Выведет 5
 println(nums2.contentToString()) // Выведет [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
}