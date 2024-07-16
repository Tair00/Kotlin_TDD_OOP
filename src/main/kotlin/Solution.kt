class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
class Solution {
    fun getDirections(root: TreeNode?, startValue: Int, destValue: Int): String {
        val pathToStart = mutableListOf<Char>()
        val pathToDest = mutableListOf<Char>()

        // Helper function to find the path from root to a given node value
        fun findPath(node: TreeNode?, value: Int, path: MutableList<Char>): Boolean {
            if (node == null) return false
            if (node.`val` == value) return true

            path.add('L')
            if (findPath(node.left, value, path)) return true
            path.removeAt(path.size - 1)

            path.add('R')
            if (findPath(node.right, value, path)) return true
            path.removeAt(path.size - 1)

            return false
        }

        // Find paths from root to startValue and destValue
        findPath(root, startValue, pathToStart)
        findPath(root, destValue, pathToDest)

        // Find the common part of the paths (LCA part)
        var i = 0
        while (i < pathToStart.size && i < pathToDest.size && pathToStart[i] == pathToDest[i]) {
            i++
        }

        // The remaining part of pathToStart needs to be converted to 'U's
        val result = StringBuilder()
        for (j in i until pathToStart.size) {
            result.append('U')
        }

        // Add the remaining part of pathToDest
        for (j in i until pathToDest.size) {
            result.append(pathToDest[j])
        }

        return result.toString()
    }
}