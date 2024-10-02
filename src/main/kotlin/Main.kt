fun main() {

    val arr1 = intArrayOf(40, 10, 20, 30)
    val arr2 = intArrayOf(100, 100, 100)
    val arr3 = intArrayOf(37, 12, 28, 9, 100, 56, 80, 5, 12)

    val solution = Solution()
    println(solution.arrayRankTransform(arr1).joinToString(", ")) // Expected Output: [4, 1, 2, 3]
    println(solution.arrayRankTransform(arr2).joinToString(", ")) // Expected Output: [1, 1, 1]
    println(solution.arrayRankTransform(arr3).joinToString(", ")) // Expected Output: [5, 3, 4, 2, 8, 6, 7, 1, 3]
}