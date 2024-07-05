
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun nodesBetweenCriticalPoints(head: ListNode?): IntArray {
        if (head == null || head.next == null || head.next!!.next == null) {
            return intArrayOf(-1, -1)
        }

        var prev: ListNode? = head
        var curr: ListNode? = head.next
        var next: ListNode? = head.next!!.next
        var index = 1
        val criticalPoints = mutableListOf<Int>()

        while (next != null) {
            if ((curr!!.`val` > prev!!.`val` && curr.`val` > next.`val`) ||
                (curr.`val` < prev.`val` && curr.`val` < next.`val`)) {
                criticalPoints.add(index)
            }
            prev = curr
            curr = next
            next = next.next
            index++
        }

        if (criticalPoints.size < 2) {
            return intArrayOf(-1, -1)
        }

        var minDistance = Int.MAX_VALUE
        var maxDistance = criticalPoints.last() - criticalPoints.first()

        for (i in 1 until criticalPoints.size) {
            minDistance = minOf(minDistance, criticalPoints[i] - criticalPoints[i - 1])
        }

        return intArrayOf(minDistance, maxDistance)
    }
}