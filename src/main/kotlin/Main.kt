fun main() {

    val root1 = TreeNode(1).apply {
        left = TreeNode(2).apply {
            right = TreeNode(4)
        }
        right = TreeNode(3)
    }
    val distance1 = 3


    val root2 = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(4)
            right = TreeNode(5)
        }
        right = TreeNode(3).apply {
            left = TreeNode(6)
            right = TreeNode(7)
        }
    }
    val distance2 = 3


    val root3 = TreeNode(7).apply {
        left = TreeNode(1).apply {
            left = TreeNode(6)
        }
        right = TreeNode(4).apply {
            left = TreeNode(5)
            right = TreeNode(3).apply {
                right = TreeNode(2)
            }
        }
    }
    val distance3 = 3

    val solution = Solution()

    println("Example 1: ${solution.countPairs(root1, distance1)}") // Output: 1
    println("Example 2: ${solution.countPairs(root2, distance2)}") // Output: 2
    println("Example 3: ${solution.countPairs(root3, distance3)}") // Output: 1
}
