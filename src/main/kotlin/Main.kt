fun main() {
        val solution = Solution()

        // Пример матрицы points
        val points = arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(1, 5, 1),
                intArrayOf(3, 1, 1)
        )

        // Вызов функции maxPoints и вывод результата
        val result = solution.maxPoints(points)
        println("Максимальное количество очков: $result")
}
