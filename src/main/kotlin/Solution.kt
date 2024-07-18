class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun countPairs(root: TreeNode?, distance: Int): Int {
        var count = 0

        fun dfs(node: TreeNode?): List<Int> {
            if (node == null) return listOf()
            if (node.left == null && node.right == null) return listOf(1)

            val leftDistances = dfs(node.left)
            val rightDistances = dfs(node.right)

            for (ld in leftDistances) {
                for (rd in rightDistances) {
                    if (ld + rd <= distance) {
                        count++
                    }
                }
            }

            val currentDistances = mutableListOf<Int>()
            for (ld in leftDistances) {
                currentDistances.add(ld + 1)
            }
            for (rd in rightDistances) {
                currentDistances.add(rd + 1)
            }

            return currentDistances
        }

        dfs(root)
        return count
    }
}
