fun main() {
    val solution = Solution()

    val s1 = "leeetcode"
    println("Input: $s1, Output: ${solution.makeFancyString(s1)}")  // Ожидается: "leetcode"

    val s2 = "aaabaaaa"
    println("Input: $s2, Output: ${solution.makeFancyString(s2)}")  // Ожидается: "aabaa"

    val s3 = "aab"
    println("Input: $s3, Output: ${solution.makeFancyString(s3)}")  // Ожидается: "aab"
}
