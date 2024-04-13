class Solution {
    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        var left = 0
        var right = height.size - 1

        while (left < right) {
            val currentArea = (right - left) * minOf(height[left], height[right])
            maxArea = maxOf(maxArea, currentArea)

            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }

        return maxArea
    }
}
