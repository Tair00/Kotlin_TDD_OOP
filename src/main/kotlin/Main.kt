fun main() {
    val solution = Solution()

    val candidates1 = intArrayOf(2, 3, 6, 7)
    val target1 = 7
    val result1 = solution.combinationSum(candidates1, target1)
    println("Комбинации для ${candidates1.contentToString()} и цели $target1: $result1")

}