
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun mergeNodes(head: ListNode?): ListNode? {
        var current = head?.next
        val dummy = ListNode(0)
        var tail = dummy

        var sum = 0

        while (current != null) {
            if (current.`val` == 0) {
                tail.next = ListNode(sum)
                tail = tail.next!!
                sum = 0
            } else {

                sum += current.`val`
            }
            current = current.next
        }

        return dummy.next
    }
}