fun main() {
    val solution = Solution()
    val books = arrayOf(
        intArrayOf(1, 3), // книга 1: толщина 1, высота 3
        intArrayOf(2, 4), // книга 2: толщина 2, высота 4
        intArrayOf(3, 2), // книга 3: толщина 3, высота 2
        intArrayOf(4, 5)  // книга 4: толщина 4, высота 5
    )
    val shelfWidth = 6

    val result = solution.minHeightShelves(books, shelfWidth)
    println(result)
}
