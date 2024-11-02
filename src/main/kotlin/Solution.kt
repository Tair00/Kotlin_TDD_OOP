class Solution {
    fun isCircularSentence(sentence: String): Boolean {
        val words = sentence.split(" ")
        val n = words.size

        for (i in words.indices) {
            val currentWord = words[i]
            val nextWord = words[(i + 1) % n]
            if (currentWord.last() != nextWord.first()) {
                return false
            }
        }

        return true
    }
}
