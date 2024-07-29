class Solution {
    fun numTeams(rating: IntArray): Int {
        var count = 0
        val n = rating.size

        for (j in 1 until n - 1) {
            var lessLeft = 0
            var greaterLeft = 0
            var lessRight = 0
            var greaterRight = 0

            for (i in 0 until j) {
                if (rating[i] < rating[j]) lessLeft++
                if (rating[i] > rating[j]) greaterLeft++
            }

            for (k in j + 1 until n) {
                if (rating[k] < rating[j]) lessRight++
                if (rating[k] > rating[j]) greaterRight++
            }

            count += lessLeft * greaterRight + greaterLeft * lessRight
        }

        return count
    }
}
