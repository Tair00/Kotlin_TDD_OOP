fun main() {
    val solution = Solution()
    val logs1 = arrayOf("d1/", "d2/", "../", "d21/", "./")
    println(solution.minOperations(logs1)) // Output: 2

    val logs2 = arrayOf("d1/", "d2/", "./", "d3/", "../", "d31/")
    println(solution.minOperations(logs2)) // Output: 3

    val logs3 = arrayOf("d1/", "../", "../", "../")
    println(solution.minOperations(logs3)) // Output: 0
}