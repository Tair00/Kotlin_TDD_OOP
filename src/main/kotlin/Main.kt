fun main() {
    val solution = Solution()

    val matrix1 = arrayOf(
        intArrayOf(3, 7, 8),
        intArrayOf(9, 11, 13),
        intArrayOf(15, 16, 17)
    )

    val matrix2 = arrayOf(
        intArrayOf(1, 10, 4, 2),
        intArrayOf(9, 3, 8, 7),
        intArrayOf(15, 16, 17, 12)
    )

    val matrix3 = arrayOf(
        intArrayOf(7, 8),
        intArrayOf(1, 2)
    )

    println(solution.luckyNumbers(matrix1)) // Output: [15]
    println(solution.luckyNumbers(matrix2)) // Output: [12]
    println(solution.luckyNumbers(matrix3)) // Output: [7]
}
