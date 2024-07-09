fun main() {
    val solution = Solution()
    val customers = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(2, 5),
        intArrayOf(4, 3)
    )
    val averageWaitingTime = solution.averageWaitingTime(customers)
    println("Average Waiting Time: %.5f".format(averageWaitingTime))
}