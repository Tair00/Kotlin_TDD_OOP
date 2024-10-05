fun main() {
    val s1 = "ab"
    val s2 = "eidbaooo"

    val solution = Solution()

    val result = solution.checkInclusion(s1, s2)

    // Печатаем результат
    println("Does s2 contain a permutation of s1? $result")
}