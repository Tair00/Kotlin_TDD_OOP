fun main() {
        val root = TreeNode(1)
        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)

        val solution = Solution()
        val result = solution.postorderTraversal(root)
        println(result)  // Output: [3, 2, 1]
}
