class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun splitListToParts(head: ListNode?, k: Int): Array<ListNode?> {
        val result = Array<ListNode?>(k) { null }
        var current = head


        var length = 0
        var temp = head
        while (temp != null) {
            length++
            temp = temp.next
        }

        val partSize = length / k
        var extraParts = length % k


        for (i in 0 until k) {
            result[i] = current
            var currentPartSize = partSize + if (extraParts > 0) 1 else 0
            extraParts--


            for (j in 1 until currentPartSize) {
                current = current?.next
            }


            val nextPart = current?.next
            current?.next = null
            current = nextPart
        }

        return result
    }
}
