import org.junit.Assert
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test


class SolutionTest {

    @Test
    fun testMergeTwoLists() {

        val list1 = createLinkedList(intArrayOf(1, 2, 4))
        val list2 = createLinkedList(intArrayOf(1, 3, 4))

        val solution = Solution()
        val mergedList = solution.mergeTwoLists(list1, list2)


        val expectedValues = intArrayOf(1, 1, 2, 3, 4, 4)
        val expectedList = createLinkedList(expectedValues)


        Assert.assertTrue(areListsEqual(expectedList, mergedList))
    }

    private fun createLinkedList(values: IntArray): ListNode? {
        if (values.isEmpty()) return null
        val head = ListNode(values[0])
        var current: ListNode? = head
        for (i in 1 until values.size) {
            current?.next = ListNode(values[i])
            current = current?.next
        }
        return head
    }

    private fun areListsEqual(list1: ListNode?, list2: ListNode?): Boolean {
        var p1: ListNode? = list1
        var p2: ListNode? = list2

        while (p1 != null && p2 != null) {
            if (p1.`val` != p2.`val`) {
                return false
            }
            p1 = p1.next
            p2 = p2.next
        }

        return p1 == null && p2 == null
    }
}
