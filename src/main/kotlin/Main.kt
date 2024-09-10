fun main() {

    val head = ListNode(18)
    head.next = ListNode(6)
    head.next?.next = ListNode(10)
    head.next?.next?.next = ListNode(3)

    println("Original list:")
    printLinkedList(head)

    val solution = Solution()
    val modifiedHead = solution.insertGreatestCommonDivisors(head)

    println("Modified list with GCD nodes inserted:")
    printLinkedList(modifiedHead)
}

fun printLinkedList(head: ListNode?) {
    var current = head
    while (current != null) {
        print("${current.`val`} ")
        current = current.next
    }
    println()
}
