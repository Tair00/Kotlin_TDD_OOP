fun main() {

    val box = arrayOf(
        charArrayOf('#', '.', '*', '.'),
        charArrayOf('#', '#', '*', '.')
    )

    val solution = Solution()

    val result = solution.rotateTheBox(box)

    println("Результат поворота коробки:")
    for (row in result) {
        println(row.joinToString(""))
    }
}