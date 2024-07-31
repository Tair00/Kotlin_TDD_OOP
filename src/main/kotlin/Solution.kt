class Solution {
    fun minHeightShelves(books: Array<IntArray>, shelfWidth: Int): Int {
        val n = books.size
        val dp = IntArray(n + 1) { Int.MAX_VALUE }
        dp[0] = 0

        for (i in 1..n) {
            var width = 0
            var height = 0
            for (j in i downTo 1) {
                width += books[j - 1][0]
                if (width > shelfWidth) break
                height = maxOf(height, books[j - 1][1])
                dp[i] = minOf(dp[i], dp[j - 1] + height)
            }
        }

        return dp[n]
    }
}
