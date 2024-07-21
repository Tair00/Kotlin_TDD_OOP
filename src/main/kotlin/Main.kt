fun main() {
    val solution = Solution()

    val k1 = 3
    val rowConditions1 = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 2)
    )
    val colConditions1 = arrayOf(
        intArrayOf(2, 1),
        intArrayOf(3, 2)
    )
    val matrix1 = solution.buildMatrix(k1, rowConditions1, colConditions1)
    println("Матрица для k1:")
    for (row in matrix1) {
        println(row.joinToString(", "))
    }
}
