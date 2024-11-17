import java.util.Deque
import java.util.LinkedList

class Solution {
    fun shortestSubarray(nums: IntArray, k: Int): Int {
        val n = nums.size
        val prefixSum = LongArray(n + 1)

        for (i in nums.indices) {
            prefixSum[i + 1] = prefixSum[i] + nums[i]
        }

        var minLength = Int.MAX_VALUE
        val deque: Deque<Int> = LinkedList()

        for (i in prefixSum.indices) {

            while (deque.isNotEmpty() && prefixSum[i] - prefixSum[deque.first()] >= k) {
                minLength = minOf(minLength, i - deque.removeFirst())
            }


            while (deque.isNotEmpty() && prefixSum[i] <= prefixSum[deque.last()]) {
                deque.removeLast()
            }

            deque.addLast(i)
        }

        return if (minLength == Int.MAX_VALUE) -1 else minLength
    }
}
