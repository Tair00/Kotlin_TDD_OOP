class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun bstToGst(root: TreeNode?): TreeNode? {
        var sum = 0


        fun reverseInOrder(node: TreeNode?) {
            if (node == null) return

            reverseInOrder(node.right)

            sum += node.`val`
            node.`val` = sum

            reverseInOrder(node.left)
        }

        reverseInOrder(root)
        return root
    }
}