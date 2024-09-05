class Solution {
    fun missingRolls(rolls: IntArray, mean: Int, n: Int): IntArray {

        val m = rolls.size
        val totalSum = mean * (n + m)


        val knownSum = rolls.sum()


        val missingSum = totalSum - knownSum


        if (missingSum < n || missingSum > 6 * n) {
            return intArrayOf() // No valid solution
        }


        val result = IntArray(n) { missingSum / n }
        var remainder = missingSum % n
        
        for (i in 0 until remainder) {
            result[i]++
        }

        return result
    }
}
