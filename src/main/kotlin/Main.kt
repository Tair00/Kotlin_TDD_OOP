fun main() {
    val head = ListNode(0)
    head.next = ListNode(3)
    head.next?.next = ListNode(1)
    head.next?.next?.next = ListNode(0)
    head.next?.next?.next?.next = ListNode(4)
    head.next?.next?.next?.next?.next = ListNode(5)
    head.next?.next?.next?.next?.next?.next = ListNode(2)
    head.next?.next?.next?.next?.next?.next?.next = ListNode(0)

    val solution = Solution()
    val result = solution.mergeNodes(head)


    var current = result
    while (current != null) {
        print("${current.`val`} ")
        current = current.next
    }
}