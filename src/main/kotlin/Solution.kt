class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        postorderHelper(root, result)
        return result
    }

    private fun postorderHelper(node: TreeNode?, result: MutableList<Int>) {
        if (node == null) {
            return
        }

        postorderHelper(node.left, result)

        postorderHelper(node.right, result)

        result.add(node.`val`)
    }
}
