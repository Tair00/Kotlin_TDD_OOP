fun main() {
        val solution = Solution()

        // Пример 1:
        val s1 = "iiii"
        val k1 = 1
        val result1 = solution.getLucky(s1, k1)
        println("Результат для s = \"$s1\" и k = $k1: $result1") // Ожидаемый результат: 36

        // Пример 2:
        val s2 = "leetcode"
        val k2 = 2
        val result2 = solution.getLucky(s2, k2)
        println("Результат для s = \"$s2\" и k = $k2: $result2") // Ожидаемый результат: 6

        // Пример 3:
        val s3 = "zbax"
        val k3 = 2
        val result3 = solution.getLucky(s3, k3)
        println("Результат для s = \"$s3\" и k = $k3: $result3") // Ожидаемый результат: 8
}
