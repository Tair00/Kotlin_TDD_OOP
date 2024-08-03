fun main() {
        val solution = Solution()
        val target1 = intArrayOf(1, 2, 3, 4)
        val arr1 = intArrayOf(2, 4, 1, 3)
        println(solution.canBeEqual(target1, arr1)) // Ожидаемый результат: true

        val target2 = intArrayOf(7)
        val arr2 = intArrayOf(7)
        println(solution.canBeEqual(target2, arr2)) // Ожидаемый результат: true

        val target3 = intArrayOf(3, 7, 9)
        val arr3 = intArrayOf(3, 7, 11)
        println(solution.canBeEqual(target3, arr3)) // Ожидаемый результат: false
}
