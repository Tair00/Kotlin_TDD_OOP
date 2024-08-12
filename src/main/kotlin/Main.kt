fun main() {
        val kthLargest = KthLargest(3, intArrayOf(4, 5, 8, 2))
        println(kthLargest.add(3))   // Outputs 4
        println(kthLargest.add(5))   // Outputs 5
        println(kthLargest.add(10))  // Outputs 5
        println(kthLargest.add(9))   // Outputs 8
        println(kthLargest.add(4))   // Outputs 8
}
