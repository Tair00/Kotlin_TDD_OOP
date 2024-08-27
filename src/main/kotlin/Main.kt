fun main() {

        val n1 = 3
        val edges1 = arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 2),
                intArrayOf(0, 2)
        )
        val succProb1 = doubleArrayOf(0.5, 0.5, 0.2)
        val start1 = 0
        val end1 = 2

        val solution = Solution()
        val result1 = solution.maxProbability(n1, edges1, succProb1, start1, end1)
        println("Max probability from $start1 to $end1 is $result1") // Output: 0.25


        val n2 = 3
        val edges2 = arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 2),
                intArrayOf(0, 2)
        )
        val succProb2 = doubleArrayOf(0.5, 0.5, 0.3)
        val start2 = 0
        val end2 = 2

        val result2 = solution.maxProbability(n2, edges2, succProb2, start2, end2)
        println("Max probability from $start2 to $end2 is $result2") // Output: 0.3


        val n3 = 4
        val edges3 = arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 2),
                intArrayOf(2, 3),
                intArrayOf(0, 3)
        )
        val succProb3 = doubleArrayOf(0.7, 0.9, 0.8, 0.6)
        val start3 = 0
        val end3 = 3

        val result3 = solution.maxProbability(n3, edges3, succProb3, start3, end3)
        println("Max probability from $start3 to $end3 is $result3") // Output: 0.72
}
