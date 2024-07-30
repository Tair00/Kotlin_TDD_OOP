class Solution {
    fun minimumDeletions(s: String): Int {
        val n = s.length
        var bCount = 0
        var minDeletions = 0

        for (char in s) {
            if (char == 'b') {
                bCount++
            } else if (char == 'a') {

                minDeletions = minOf(minDeletions + 1, bCount)
            }
        }

        return minDeletions
    }
}
