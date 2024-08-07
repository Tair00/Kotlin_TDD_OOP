fun main() {
        val solution = Solution()

        val testCases = listOf(123, 12345, 1234567, 0, 100, 1000, 1000000)

        for (testCase in testCases) {
                println("Input: $testCase")
                println("Output: ${solution.numberToWords(testCase)}")
                println()
        }
}