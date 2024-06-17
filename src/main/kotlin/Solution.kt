class Solution {
    fun judgeSquareSum(c: Int): Boolean {
        for (a in 0..Math.sqrt(c.toDouble()).toInt()) {
            val b = c - a * a
            if (isPerfectSquare(b)) {
                return true
            }
        }
        return false
    }

    private fun isPerfectSquare(num: Int): Boolean {
        val root = Math.sqrt(num.toDouble()).toInt()
        return root * root == num
    }
}
