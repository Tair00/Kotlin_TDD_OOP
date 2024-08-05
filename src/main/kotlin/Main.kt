fun main() {
        val solution = Solution()

        // Пример 1
        val arr1 = arrayOf("d", "b", "c", "b", "c", "a")
        val k1 = 2
        println(solution.kthDistinct(arr1, k1)) // Ожидаемый результат: "a"

        // Пример 2
        val arr2 = arrayOf("aaa", "aa", "a")
        val k2 = 1
        println(solution.kthDistinct(arr2, k2)) // Ожидаемый результат: "aaa"

        // Пример 3
        val arr3 = arrayOf("a", "b", "a")
        val k3 = 3
        println(solution.kthDistinct(arr3, k3)) // Ожидаемый результат: ""
}
