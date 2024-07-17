class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
class Solution {
    fun delNodes(root: TreeNode?, to_delete: IntArray): List<TreeNode?> {
        val toDeleteSet = to_delete.toSet()
        val result = mutableListOf<TreeNode?>()

        fun helper(node: TreeNode?, isRoot: Boolean): TreeNode? {
            if (node == null) return null

            val deleted = node.`val` in toDeleteSet
            if (isRoot && !deleted) {
                result.add(node)
            }

            node.left = helper(node.left, deleted)
            node.right = helper(node.right, deleted)

            return if (deleted) null else node
        }

        helper(root, true)
        return result
    }
}
