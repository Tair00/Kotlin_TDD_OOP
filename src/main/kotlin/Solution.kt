class Solution {
    fun replaceValueInTree(root: TreeNode?): TreeNode? {
        if (root == null) return null

        val queue: MutableList<TreeNode> = mutableListOf(root)
        val parentMap = mutableMapOf<TreeNode, TreeNode>()
        while (queue.isNotEmpty()) {
            val levelSize = queue.size
            for (i in 0 until levelSize) {
                val node = queue.removeAt(0)

                if (node.left != null) {
                    queue.add(node.left!!)
                    parentMap[node.left!!] = node
                }
                if (node.right != null) {
                    queue.add(node.right!!)
                    parentMap[node.right!!] = node
                }
            }
        }

        queue.add(root)
        while (queue.isNotEmpty()) {
            val levelSize = queue.size
            val levelNodes = mutableListOf<TreeNode>()
            val levelSum = mutableMapOf<TreeNode, Int>()
            for (i in 0 until levelSize) {
                val node = queue.removeAt(0)
                levelNodes.add(node)

                val parent = parentMap[node]
                if (parent != null) {
                    levelSum[parent] = (levelSum[parent] ?: 0) + node.`val`
                }

                if (node.left != null) {
                    queue.add(node.left!!)
                }
                if (node.right != null) {
                    queue.add(node.right!!)
                }
            }

            for (node in levelNodes) {
                val parent = parentMap[node]
                val siblingSum = levelSum[parent] ?: 0
                val cousinSum = levelSum.values.sum() - siblingSum
                node.`val` = cousinSum
            }
        }

        return root
    }
}