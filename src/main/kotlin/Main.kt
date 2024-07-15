fun main() {
    val solution = Solution()
    val descriptions = arrayOf(
        intArrayOf(20, 15, 1),
        intArrayOf(20, 17, 0),
        intArrayOf(50, 20, 1),
        intArrayOf(50, 80, 0),
        intArrayOf(80, 19, 1)
    )
    val root = solution.createBinaryTree(descriptions)
    printTree(root)
}

fun printTree(root: TreeNode?) {
    if (root == null) return
    println(root.`val`)
    printTree(root.left)
    printTree(root.right)
}