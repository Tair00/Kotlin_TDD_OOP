fun main() {
        val solution = Solution()

        // Пример 1
        val n1 = "123"
        println("Input: $n1")
        println("Output: ${solution.nearestPalindromic(n1)}")  // Ожидается "121"

        // Пример 2
        val n2 = "1"
        println("Input: $n2")
        println("Output: ${solution.nearestPalindromic(n2)}")  // Ожидается "0"

        // Пример 3
        val n3 = "999"
        println("Input: $n3")
        println("Output: ${solution.nearestPalindromic(n3)}")  // Ожидается "1001"

        // Пример 4
        val n4 = "10"
        println("Input: $n4")
        println("Output: ${solution.nearestPalindromic(n4)}")  // Ожидается "9"

        // Пример 5
        val n5 = "808"
        println("Input: $n5")
        println("Output: ${solution.nearestPalindromic(n5)}")  // Ожидается "797"
}