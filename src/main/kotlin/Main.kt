fun main() {
    val solution = Solution()

    val testSentences = listOf(
        "leetcode exercises sound delightful",
        "eetcode",
        "Leetcode is cool",
        "happy Leetcode",
        "a"
    )

    for (sentence in testSentences) {
        val result = solution.isCircularSentence(sentence)
        println("Is the sentence '$sentence' circular? $result")
    }
}