fun main() {
        val arrays = listOf(
                listOf(1, 2, 3),
                listOf(4, 5),
                listOf(1, 2, 3)
        )

        val solution = Solution()
        val result = solution.maxDistance(arrays)

        println("Максимальное расстояние: $result")
}