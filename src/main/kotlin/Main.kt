fun main() {
    val solution = Solution()

    // Test case 1
    val arr1 = intArrayOf(1, 2, 3, 10, 4, 2, 3, 5)
    println("Input: ${arr1.joinToString(", ")}")
    println("Output: ${solution.findLengthOfShortestSubarray(arr1)}") // Expected: 3

    // Test case 2
    val arr2 = intArrayOf(5, 4, 3, 2, 1)
    println("\nInput: ${arr2.joinToString(", ")}")
    println("Output: ${solution.findLengthOfShortestSubarray(arr2)}") // Expected: 4

    // Test case 3
    val arr3 = intArrayOf(1, 2, 3)
    println("\nInput: ${arr3.joinToString(", ")}")
    println("Output: ${solution.findLengthOfShortestSubarray(arr3)}") // Expected: 0

    // Additional test case
    val arr4 = intArrayOf(1, 3, 2, 4, 5)
    println("\nInput: ${arr4.joinToString(", ")}")
    println("Output: ${solution.findLengthOfShortestSubarray(arr4)}") // Expected: 1
}
