fun main() {

        val nums1 = intArrayOf(1, 2, 3)
        val head1 = createLinkedList(intArrayOf(1, 2, 3, 4, 5))
        val solution = Solution()
        val result1 = solution.modifiedList(nums1, head1)
        print("Example 1 result: ")
        printLinkedList(result1)  // Output: 4 5

        val nums2 = intArrayOf(1)
        val head2 = createLinkedList(intArrayOf(1, 2, 1, 2, 1, 2))
        val result2 = solution.modifiedList(nums2, head2)
        print("Example 2 result: ")
        printLinkedList(result2)  // Output: 2 2 2

        val nums3 = intArrayOf(5)
        val head3 = createLinkedList(intArrayOf(1, 2, 3, 4))
        val result3 = solution.modifiedList(nums3, head3)
        print("Example 3 result: ")
        printLinkedList(result3)  // Output: 1 2 3 4
}