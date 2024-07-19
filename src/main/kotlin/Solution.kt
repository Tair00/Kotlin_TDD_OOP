class Solution {
    fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
        val luckyNumbers = mutableListOf<Int>()

        for (i in matrix.indices) {
            val row = matrix[i]
            var minInRow = row[0]
            var minIndex = 0
            for (j in row.indices) {
                if (row[j] < minInRow) {
                    minInRow = row[j]
                    minIndex = j
                }
            }

            var isMaxInCol = true
            for (k in matrix.indices) {
                if (matrix[k][minIndex] > minInRow) {
                    isMaxInCol = false
                    break
                }
            }

            if (isMaxInCol) {
                luckyNumbers.add(minInRow)
            }
        }

        return luckyNumbers
    }
}
