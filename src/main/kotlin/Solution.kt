import kotlin.math.*

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
        var current = head

        while (current != null && current.next != null) {e
            val gcdValue = gcd(current.`val`, current.next!!.`val`)


            val newNode = ListNode(gcdValue)


            newNode.next = current.next
            current.next = newNode


            current = newNode.next
        }

        return head
    }

    private fun gcd(a: Int, b: Int): Int {
        if (b == 0) return a
        return gcd(b, a % b)
    }
}
