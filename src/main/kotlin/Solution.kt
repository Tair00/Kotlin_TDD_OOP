import java.util.*

class Solution {
    fun kthLargestLevelSum(root: TreeNode?, k: Int): Long {

        if (root == null) {
            return -1
        }


        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)

        val levelSums = mutableListOf<Long>()

        while (queue.isNotEmpty()) {
            var levelSize = queue.size
            var levelSum: Long = 0

            for (i in 0 until levelSize) {
                val node = queue.poll()
                levelSum += node.`val`.toLong()

                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }

            levelSums.add(levelSum)
        }

        levelSums.sortDescending()

        return if (levelSums.size < k) {
            -1
        } else {
            levelSums[k - 1]
        }
    }
}