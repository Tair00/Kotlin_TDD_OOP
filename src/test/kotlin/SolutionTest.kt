import org.junit.Assert
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test


internal class SolutionTest {
    @Test
    fun testRemoveNthFromEnd() {
        val solution = Solution()

        // Example 1
        var head = ListNode(1)
        head.next = ListNode(2)
        head.next?.next = ListNode(3)
        head.next?.next?.next = ListNode(4)
        head.next?.next?.next?.next = ListNode(5)
        var newHead = solution.removeNthFromEnd(head, 2)
        var expected = intArrayOf(1, 2, 3, 5)
        assertArrayEquals(expected, convertToArray(newHead))

        // Example 2
        head = ListNode(1)
        newHead = solution.removeNthFromEnd(head, 1)
        assertNull(newHead)

        // Example 3
        head = ListNode(1)
        head.next = ListNode(2)
        newHead = solution.removeNthFromEnd(head, 1)
        expected = intArrayOf(1)
        assertArrayEquals(expected, convertToArray(newHead))
    }

    private fun convertToArray(head: ListNode?): IntArray {
        val result = mutableListOf<Int>()
        var current: ListNode? = head
        while (current != null) {
            result.add(current.`val`)
            current = current.next
        }
        return result.toIntArray()
    }
}