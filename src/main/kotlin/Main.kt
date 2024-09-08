fun main() {

    fun createLinkedList(arr: IntArray): ListNode? {
        if (arr.isEmpty()) return null
        val head = ListNode(arr[0])
        var current = head
        for (i in 1 until arr.size) {
            current.next = ListNode(arr[i])
            current = current.next!!
        }
        return head
    }


    fun printLinkedList(head: ListNode?) {
        var current = head
        while (current != null) {
            print("${current!!.`val`} ")
            current = current!!.next
        }
        println()
    }


    val head1 = createLinkedList(intArrayOf(1, 2, 3))
    val k1 = 5
    val solution = Solution()
    val result1 = solution.splitListToParts(head1, k1)

    println("Example 1 result:")
    for (part in result1) {
        printLinkedList(part)
    }

    val head2 = createLinkedList(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    val k2 = 3
    val result2 = solution.splitListToParts(head2, k2)

    println("Example 2 result:")
    for (part in result2) {
        printLinkedList(part)
    }
}
