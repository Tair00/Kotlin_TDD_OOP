
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}


class Solution {
    fun modifiedList(nums: IntArray, head: ListNode?): ListNode? {
        val numSet = nums.toSet()
        val dummy = ListNode(0)
        dummy.next = head
        var current = dummy
        while (current.next != null) {
            if (current.next?.`val` in numSet) {
                current.next = current.next?.next
            } else {
                current = current.next!!
            }
        }
        return dummy.next
    }
}

fun createLinkedList(arr: IntArray): ListNode? {
    if (arr.isEmpty()) return null
    val head = ListNode(arr[0])
    var current = head
    for (i in 1 until arr.size) {
        current.next = ListNode(arr[i])
        current = current.next!!
    }
    return head
}

fun printLinkedList(head: ListNode?) {
    var current = head
    while (current != null) {
        print("${current.`val`} ")
        current = current.next
    }
    println()
}