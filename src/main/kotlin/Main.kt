fun main() {
    val solution = Solution()

    val nums1 = intArrayOf(136, 256, 10)
    println("Can nums1 be sorted? ${solution.canSortArray(nums1)}")  // Expected output: false

    val nums2 = intArrayOf(8, 4, 2, 30, 15)
    println("Can nums2 be sorted? ${solution.canSortArray(nums2)}")  // Expected output: true
}
