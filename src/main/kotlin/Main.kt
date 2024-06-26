// Example usage:
fun main() {

    val root = TreeNode(1).apply {
        right = TreeNode(2).apply {
            right = TreeNode(3).apply {
                right = TreeNode(4)
            }
        }
    }

    val solution = Solution()
    val balancedRoot = solution.balanceBST(root)


    fun printInOrder(node: TreeNode?) {
        if (node == null) return
        printInOrder(node.left)
        print("${node.`val`} ")
        printInOrder(node.right)
    }

    printInOrder(balancedRoot)
    println()
}