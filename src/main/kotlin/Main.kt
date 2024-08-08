fun main() {
        val solution = Solution()
        val result1 = solution.spiralMatrixIII(1, 4, 0, 0)
        result1.forEach { println(it.contentToString()) } // Ожидаемый результат: [[0, 0], [0, 1], [0, 2], [0, 3]]

        val result2 = solution.spiralMatrixIII(5, 6, 1, 4)
        result2.forEach { println(it.contentToString()) } // Ожидаемый результат: [[1, 4], [1, 5], [2, 5], ...]
}
