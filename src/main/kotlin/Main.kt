fun main() {

    val root = TreeNode(4).apply {
        left = TreeNode(1).apply {
            left = TreeNode(0)
            right = TreeNode(2).apply {
                right = TreeNode(3)
            }
        }
        right = TreeNode(6).apply {
            left = TreeNode(5)
            right = TreeNode(7).apply {
                right = TreeNode(8)
            }
        }
    }


    val solution = Solution()
    val gstRoot = solution.bstToGst(root)


    fun printInOrder(node: TreeNode?) {
        if (node == null) return
        printInOrder(node.left)
        print("${node.`val`} ")
        printInOrder(node.right)
    }


    printInOrder(gstRoot)
    println()
}