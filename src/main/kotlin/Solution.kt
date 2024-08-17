class Solution {
    fun maxPoints(points: Array<IntArray>): Long {
        val m = points.size
        val n = points[0].size
        var dp = LongArray(n) { points[0][it].toLong() }

        for (r in 1 until m) {
            val newDp = LongArray(n)

            // Left pass
            var leftMax = dp[0]
            newDp[0] = leftMax + points[r][0]
            for (c in 1 until n) {
                leftMax = maxOf(leftMax - 1, dp[c])
                newDp[c] = leftMax + points[r][c]
            }

            // Right pass
            var rightMax = dp[n - 1]
            newDp[n - 1] = maxOf(newDp[n - 1], rightMax + points[r][n - 1])
            for (c in n - 2 downTo 0) {
                rightMax = maxOf(rightMax - 1, dp[c])
                newDp[c] = maxOf(newDp[c], rightMax + points[r][c])
            }

            dp = newDp
        }

        return dp.maxOrNull() ?: 0L
    }
}
