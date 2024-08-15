fun main() {
        val solution = Solution()

        val bills1 = intArrayOf(5, 5, 5, 10, 20)
        println(solution.lemonadeChange(bills1)) // Ожидается true

        val bills2 = intArrayOf(5, 5, 10, 10, 20)
        println(solution.lemonadeChange(bills2)) // Ожидается false
}
