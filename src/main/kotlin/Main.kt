fun main() {
    val solution = Solution()

    println(solution.minKBitFlips(intArrayOf(0, 1, 0), 1))  // Output: 2
    println(solution.minKBitFlips(intArrayOf(1, 1, 0), 2))  // Output: -1
    println(solution.minKBitFlips(intArrayOf(0, 0, 0, 1, 0, 1, 1, 0), 3))  // Output: 3
}
