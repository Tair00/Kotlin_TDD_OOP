class Solution {
    fun findLengthOfShortestSubarray(arr: IntArray): Int {
        val n = arr.size
        var left = 0
        while (left < n - 1 && arr[left] <= arr[left + 1]) {
            left++
        }

        if (left == n - 1) return 0

        var right = n - 1
        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--
        }

        var result = n - left - 1

        result = minOf(result, right)

        var i = 0
        var j = right
        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                result = minOf(result, j - i - 1)
                i++
            } else {
                j++
            }
        }

        return result
    }
}
