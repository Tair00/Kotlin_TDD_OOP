fun main() {

    val solution = Solution()


    val items = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 2),
        intArrayOf(2, 4),
        intArrayOf(5, 6),
        intArrayOf(3, 5)
    )
    val queries = intArrayOf(1, 2, 3, 4, 5, 6)

    val result = solution.maximumBeauty(items, queries)

    println(result.joinToString(", "))
}
