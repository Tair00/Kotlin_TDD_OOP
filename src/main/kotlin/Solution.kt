class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var count = 0

        for (num in arr) {
            if (num % 2 != 0) {
                count++
                if (count == 3) {
                    return true
                }
            } else {
                count = 0
            }
        }

        return false
    }
}
