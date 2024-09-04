fun main() {
        val commands = intArrayOf(4, -1, 4, -2, 4)
        val obstacles = arrayOf(intArrayOf(2, 4))

        val solution = Solution()
        val result = solution.robotSim(commands, obstacles)

        println("Maximum Euclidean distance squared: $result")
}