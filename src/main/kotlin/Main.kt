fun main() {

    val node1 = ListNode(5)
    val node2 = ListNode(3)
    val node3 = ListNode(1)
    val node4 = ListNode(2)
    val node5 = ListNode(5)
    val node6 = ListNode(1)
    val node7 = ListNode(2)


    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6
    node6.next = node7


    val solution = Solution()


    val result = solution.nodesBetweenCriticalPoints(node1)


    println("minDistance: ${result[0]}, maxDistance: ${result[1]}")
}