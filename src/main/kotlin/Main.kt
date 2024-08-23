fun main() {
        val solution = Solution()

        val expression1 = "-1/2+1/2"
        println(solution.fractionAddition(expression1))  // Output: "0/1"

        val expression2 = "-1/2+1/2+1/3"
        println(solution.fractionAddition(expression2))  // Output: "1/3"

        val expression3 = "1/3-1/2"
        println(solution.fractionAddition(expression3))  // Output: "-1/6"
}
