import java.util.*

fun main() {
        val solution = Solution()

        // Test Case 1
        val n1 = 3
        val edges1 = arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 2),
                intArrayOf(0, 2)
        )
        val succProb1 = doubleArrayOf(0.5, 0.5, 0.2)
        val startNode1 = 0
        val endNode1 = 2
        val result1 = solution.maxProbability(n1, edges1, succProb1, startNode1, endNode1)
        println("Max Probability for Test Case 1: $result1")  // Expected: 0.25

        // Test Case 2
        val n2 = 3
        val edges2 = arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 2),
                intArrayOf(0, 2)
        )
        val succProb2 = doubleArrayOf(0.5, 0.5, 0.3)
        val startNode2 = 0
        val endNode2 = 2
        val result2 = solution.maxProbability(n2, edges2, succProb2, startNode2, endNode2)
        println("Max Probability for Test Case 2: $result2")  // Expected: 0.3

        // Test Case 3
        val n3 = 3
        val edges3 = arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 2)
        )
        val succProb3 = doubleArrayOf(0.5, 0.5)
        val startNode3 = 0
        val endNode3 = 2
        val result3 = solution.maxProbability(n3, edges3, succProb3, startNode3, endNode3)
        println("Max Probability for Test Case 3: $result3")  // Expected: 0.25

        // Test Case 4
        val n4 = 2
        val edges4 = arrayOf(
                intArrayOf(0, 1)
        )
        val succProb4 = doubleArrayOf(0.5)
        val startNode4 = 0
        val endNode4 = 1
        val result4 = solution.maxProbability(n4, edges4, succProb4, startNode4, endNode4)
        println("Max Probability for Test Case 4: $result4")  // Expected: 0.5
}
