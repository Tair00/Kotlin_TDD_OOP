fun main() {
    val solution = Solution()
    val s1 = "cdbcbbaaabab"
    val x1 = 4
    val y1 = 5
    val result1 = solution.maximumGain(s1, x1, y1)
    println("Result 1: $result1") // Ожидаемый результат: 19

    val s2 = "aabbaaxybbaabb"
    val x2 = 5
    val y2 = 4
    val result2 = solution.maximumGain(s2, x2, y2)
    println("Result 2: $result2") // Ожидаемый результат: 20
}
