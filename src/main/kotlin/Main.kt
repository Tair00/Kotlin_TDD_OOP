fun main() {
        val solution = Solution()

        // Test Case 1
        val n1 = 5
        val edges1 = arrayOf(
                intArrayOf(4, 1, -1),
                intArrayOf(2, 0, -1),
                intArrayOf(0, 3, -1),
                intArrayOf(4, 3, -1)
        )
        val source1 = 0
        val destination1 = 1
        val target1 = 5
        val result1 = solution.modifiedGraphEdges(n1, edges1, source1, destination1, target1)
        println("Output for Test Case 1:")
        result1.forEach { println(it.contentToString()) }

        // Test Case 2
        val n2 = 3
        val edges2 = arrayOf(
                intArrayOf(0, 1, -1),
                intArrayOf(0, 2, 5)
        )
        val source2 = 0
        val destination2 = 2
        val target2 = 6
        val result2 = solution.modifiedGraphEdges(n2, edges2, source2, destination2, target2)
        println("Output for Test Case 2:")
        result2.forEach { println(it.contentToString()) }

        // Test Case 3
        val n3 = 4
        val edges3 = arrayOf(
                intArrayOf(1, 0, 4),
                intArrayOf(1, 2, 3),
                intArrayOf(2, 3, 5),
                intArrayOf(0, 3, -1)
        )
        val source3 = 0
        val destination3 = 2
        val target3 = 6
        val result3 = solution.modifiedGraphEdges(n3, edges3, source3, destination3, target3)
        println("Output for Test Case 3:")
        result3.forEach { println(it.contentToString()) }
}
