fun main() {

    val names = arrayOf("Mary", "John", "Emma")
    val heights = intArrayOf(180, 165, 170)


    val solution = Solution()

    val sortedNames = solution.sortPeople(names, heights)

    println("Sorted names by height:")
    sortedNames.forEach { println(it) }
}
