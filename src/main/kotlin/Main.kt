fun main() {
        val solution = Solution()
        val details1 = arrayOf("7868190130M7522", "5303914400F9211", "9273338290F4010")
        println(solution.countSeniors(details1)) // Ожидаемый результат: 2

        val details2 = arrayOf("1313579440F2036", "2921522980M5644")
        println(solution.countSeniors(details2)) // Ожидаемый результат: 0
}
