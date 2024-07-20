fun main() {
    val solution = Solution()

    val rowSum1 = intArrayOf(3, 8)
    val colSum1 = intArrayOf(4, 7)
    val matrix1 = solution.restoreMatrix(rowSum1, colSum1)
    println("Матрица для rowSum1 и colSum1:")
    for (row in matrix1) {
        println(row.joinToString(", "))
    }

    val rowSum2 = intArrayOf(5, 7, 10)
    val colSum2 = intArrayOf(8, 6, 8)
    val matrix2 = solution.restoreMatrix(rowSum2, colSum2)
    println("\nМатрица для rowSum2 и colSum2:")
    for (row in matrix2) {
        println(row.joinToString(", "))
    }

    val rowSum3 = intArrayOf(14, 9, 4)
    val colSum3 = intArrayOf(6, 8, 7, 6)
    val matrix3 = solution.restoreMatrix(rowSum3, colSum3)
    println("\nМатрица для rowSum3 и colSum3:")
    for (row in matrix3) {
        println(row.joinToString(", "))
    }
}
