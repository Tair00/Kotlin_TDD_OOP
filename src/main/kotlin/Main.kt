fun main() {

    val root = TreeNode(154282)
    root.left = TreeNode(259410)
    root.right = TreeNode(741548)

    root.left?.left = TreeNode(66685)
    root.left?.right = TreeNode(834946)
    root.right?.left = TreeNode(24416)
    root.right?.right = TreeNode(49355)


    val solution = Solution()


    val k = 3
    val result = solution.kthLargestLevelSum(root, k)

    println("Результат: $result")
}