fun main() {

    val solution = Solution()

    val allowed = "abc"

    val words = arrayOf("a", "b", "c", "ab", "ac", "bc", "abc", "d", "abcd")

    val result = solution.countConsistentStrings(allowed, words)
    println("Количество согласованных строк: $result")
}
