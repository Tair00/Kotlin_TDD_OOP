fun main() {
    val solution = Solution()

    // Example 1
    val code1 = intArrayOf(5, 7, 1, 4)
    val k1 = 3
    println("Decrypted code for Example 1: ${solution.decrypt(code1, k1).toList()}")

    // Example 2
    val code2 = intArrayOf(1, 2, 3, 4)
    val k2 = 0
    println("Decrypted code for Example 2: ${solution.decrypt(code2, k2).toList()}")

    // Example 3
    val code3 = intArrayOf(2, 4, 9, 3)
    val k3 = -2
    println("Decrypted code for Example 3: ${solution.decrypt(code3, k3).toList()}")
}
