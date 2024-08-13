fun main() {
        val solution = Solution()
        val candidates1 = intArrayOf(10,1,2,7,6,1,5)
        val target1 = 8
        println(solution.combinationSum2(candidates1, target1))  // Ожидаемый результат: [[1,1,6], [1,2,5], [1,7], [2,6]]

        val candidates2 = intArrayOf(2,5,2,1,2)
        val target2 = 5
        println(solution.combinationSum2(candidates2, target2))  // Ожидаемый результат: [[1,2,2], [5]]
}
