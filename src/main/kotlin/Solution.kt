class Solution {
    fun minimizedMaximum(n: Int, quantities: IntArray): Int {
        var left = 1
        var right = quantities.maxOrNull() ?: 1

        while (left < right) {
            val mid = left + (right - left) / 2
            if (canDistribute(n, quantities, mid)) {
                right = mid
            } else {
                left = mid + 1
            }
        }

        return left
    }

    private fun canDistribute(n: Int, quantities: IntArray, maxProductsPerStore: Int): Boolean {
        var storesNeeded = 0
        for (quantity in quantities) {
            storesNeeded += (quantity + maxProductsPerStore - 1) / maxProductsPerStore
            if (storesNeeded > n) {
                return false
            }
        }
        return true
    }
}
