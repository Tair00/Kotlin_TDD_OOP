fun main() {
    // Example 1
    val root1 = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(4)
            right = TreeNode(5)
        }
        right = TreeNode(3).apply {
            left = TreeNode(6)
            right = TreeNode(7)
        }
    }
    val toDelete1 = intArrayOf(3, 5)

    val solution = Solution()
    val forest1 = solution.delNodes(root1, toDelete1)
    println(forest1.map { it?.`val` })  // Expected output: [1, 6, 7]

    // Example 2
    val root2 = TreeNode(1).apply {
        left = TreeNode(2).apply {
            right = TreeNode(4).apply {
                left = TreeNode(3)
            }
        }
    }
    val toDelete2 = intArrayOf(3)

    val forest2 = solution.delNodes(root2, toDelete2)
    println(forest2.map { it?.`val` })  // Expected output: [1]
}