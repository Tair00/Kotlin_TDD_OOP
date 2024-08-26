fun main() {
        val root = Node(1)
        val child1 = Node(3)
        val child2 = Node(2)
        val child3 = Node(4)
        child1.children = listOf(Node(5), Node(6))
        root.children = listOf(child1, child2, child3)

        val solution = Solution()

        val result = solution.postorder(root)
        println(result)  // Output: [5, 6, 3, 2, 4, 1]
}
