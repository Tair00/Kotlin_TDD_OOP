class Solution {
    fun mySqrt(x: Int): Int {
        if (x == 0) return 0
        if (x == 1) return 1

        var left = 1
        var right = x
        var result = 0

        while (left <= right) {
            val mid = left + (right - left) / 2
            if (mid <= x / mid) {
                result = mid
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return result
    }
}