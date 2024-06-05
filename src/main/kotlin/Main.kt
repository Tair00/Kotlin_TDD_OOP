fun main() {
    val solution = Solution()

    val nums1 = intArrayOf(2,3,0,1,4)
    val target1 = 5
    println(solution.jump(nums1))
    val nums2 = intArrayOf(0)
    println(solution.jump(nums2))
    val nums3 = intArrayOf(1,1,1,1)
    println(solution.jump(nums3))
}