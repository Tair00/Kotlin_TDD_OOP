fun main() {
    val solution = Solution()

    val digits1 = intArrayOf(1, 2, 3)
    println(solution.plusOne(digits1).contentToString()) // Output: [1, 2, 4]

    val digits2 = intArrayOf(4, 3, 2, 1)
    println(solution.plusOne(digits2).contentToString()) // Output: [4, 3, 2, 2]

    val digits3 = intArrayOf(9)
    println(solution.plusOne(digits3).contentToString()) // Output: [1, 0]
}