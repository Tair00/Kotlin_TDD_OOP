fun main() {
        val solution = Solution()

        val num1 = 5
        val result1 = solution.findComplement(num1)
        println("Complement of $num1 is $result1")  // Ожидается вывод: Complement of 5 is 2

        val num2 = 1
        val result2 = solution.findComplement(num2)
        println("Complement of $num2 is $result2")  // Ожидается вывод: Complement of 1 is 0
}