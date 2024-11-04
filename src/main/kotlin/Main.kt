fun main() {
    val solution = Solution()

    val word1 = "abcde"
    println("Input: $word1, Compressed: ${solution.compressedString(word1)}")

    val word2 = "aaaaaaaaaaaaaabb"
    println("Input: $word2, Compressed: ${solution.compressedString(word2)}")
}