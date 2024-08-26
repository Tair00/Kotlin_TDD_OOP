class Node(var `val`: Int) {
    var children: List<Node?> = listOf()
}


class Solution {
    fun postorder(root: Node?): List<Int> {
        val result = mutableListOf<Int>()
        postorderHelper(root, result)
        return result
    }

    private fun postorderHelper(node: Node?, result: MutableList<Int>) {
        if (node == null) return

        for (child in node.children) {
            postorderHelper(child, result)
        }

        result.add(node.`val`)
    }
}
