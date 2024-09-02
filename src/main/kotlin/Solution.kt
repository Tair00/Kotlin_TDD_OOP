class Solution {
    fun chalkReplacer(chalk: IntArray, k: Int): Int {

        val totalChalk = chalk.map { it.toLong() }.sum()


        var remainingChalk = k % totalChalk


        for (i in chalk.indices) {
            if (remainingChalk < chalk[i]) {
                return i
            }
            remainingChalk -= chalk[i]
        }

        return -1
    }
}