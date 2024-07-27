fun main() {
    val solution = Solution()

    // Пример 1
    val source1 = "abcd"
    val target1 = "acbe"
    val original1 = charArrayOf('a', 'b', 'c', 'c', 'e', 'd')
    val changed1 = charArrayOf('b', 'c', 'b', 'e', 'b', 'e')
    val cost1 = intArrayOf(2, 5, 5, 1, 2, 20)
    val result1 = solution.minimumCost(source1, target1, original1, changed1, cost1)
    println("Example 1: $result1") // Output: 28

    // Пример 2
    val source2 = "aaaa"
    val target2 = "bbbb"
    val original2 = charArrayOf('a', 'c')
    val changed2 = charArrayOf('c', 'b')
    val cost2 = intArrayOf(1, 2)
    val result2 = solution.minimumCost(source2, target2, original2, changed2, cost2)
    println("Example 2: $result2") // Output: 12

    // Пример 3
    val source3 = "abcd"
    val target3 = "abce"
    val original3 = charArrayOf('a')
    val changed3 = charArrayOf('e')
    val cost3 = intArrayOf(10000)
    val result3 = solution.minimumCost(source3, target3, original3, changed3, cost3)
    println("Example 3: $result3") // Output: -1
}
