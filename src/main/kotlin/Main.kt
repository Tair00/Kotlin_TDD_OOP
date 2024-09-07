fun main() {
    val solution = Solution()
    val head = ListNode(4)
    head.next = ListNode(2)
    head.next?.next = ListNode(8)
    val root = TreeNode(1)
    root.left = TreeNode(4)
    root.right = TreeNode(4)
    root.left?.right = TreeNode(2)
    root.right?.right = TreeNode(2)
    root.left?.right?.left = TreeNode(6)
    root.left?.right?.right = TreeNode(8)

    val result = solution.isSubPath(head, root)
    println(result)
}