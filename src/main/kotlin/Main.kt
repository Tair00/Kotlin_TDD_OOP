fun main() {
    val m = 3
    val n = 5
    val listValues = listOf(3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0)

    val head = createLinkedList(listValues)

    // Создание объекта Solution и вызов метода spiralMatrix
    val solution = Solution()
    val head = createLinkedList(listValues)
    val resultMatrix = solution.spiralMatrix(m, n, head)

    // Вывод результата
    for (row in resultMatrix) {
        println(row.joinToString(", "))
    }
}
fun createLinkedList(values: List<Int>): ListNode? {
    if (values.isEmpty()) return null

    val head = ListNode(values[0])
    var current = head

    for (i in 1 until values.size) {
        current.next = ListNode(values[i])
        current = current.next!!
    }

    return head
}