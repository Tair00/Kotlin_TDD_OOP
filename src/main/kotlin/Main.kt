fun main() {

    val root = TreeNode(5)
    root.left = TreeNode(1)
    root.right = TreeNode(2)
    root.left?.left = TreeNode(3)
    root.left?.right = TreeNode(4)


    val startValue = 3
    val destValue = 4


    val solution = Solution()
    val result = solution.getDirections(root, startValue, destValue)


    println(result)
}
