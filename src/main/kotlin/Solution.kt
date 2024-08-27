class Solution {
    fun climbStairs(n: Int): Int {
        if (n == 1) return 1
        if (n == 2) return 2

        var oneStepBefore = 2
        var twoStepsBefore = 1
        var allWays = 0

        for (i in 3..n) {
            allWays = oneStepBefore + twoStepsBefore
            twoStepsBefore = oneStepBefore
            oneStepBefore = allWays
        }

        return allWays
    }
}
