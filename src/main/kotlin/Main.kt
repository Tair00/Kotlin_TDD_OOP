fun main() {
    // Пример дерева
    val root = TreeNode(5)
    root.left = TreeNode(4)
    root.right = TreeNode(9)
    root.left?.left = TreeNode(1)
    root.left?.right = TreeNode(10)
    root.right?.right = TreeNode(7)

    // Создаем экземпляр решения
    val solution = Solution()

    // Вызов функции замены значений
    val newRoot = solution.replaceValueInTree(root)


}
