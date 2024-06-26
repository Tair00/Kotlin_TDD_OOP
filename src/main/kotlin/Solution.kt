class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun balanceBST(root: TreeNode?): TreeNode? {
        val values = mutableListOf<Int>()


        fun inOrderTraversal(node: TreeNode?) {
            if (node == null) return
            inOrderTraversal(node.left)
            values.add(node.`val`)
            inOrderTraversal(node.right)
        }


        fun buildBalancedBST(start: Int, end: Int): TreeNode? {
            if (start > end) return null
            val mid = start + (end - start) / 2
            val node = TreeNode(values[mid])
            node.left = buildBalancedBST(start, mid - 1)
            node.right = buildBalancedBST(mid + 1, end)
            return node
        }


        inOrderTraversal(root)

        return buildBalancedBST(0, values.size - 1)
    }
}