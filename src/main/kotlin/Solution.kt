class Solution {
    fun compressedString(word: String): String {
        val comp = StringBuilder()
        var i = 0

        while (i < word.length) {
                        val c = word[i]
            var count = 0

                       while (i < word.length && word[i] == c && count < 9) {
                count++
                i++
            }
            comp.append(count).append(c)
        }

        return comp.toString()
    }
}
