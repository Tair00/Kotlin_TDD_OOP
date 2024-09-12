class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        val allowedSet = allowed.toSet()
        var count = 0


        for (word in words) {
            if (word.all { it in allowedSet }) {
                count++
            }
        }

        return count
    }
}
