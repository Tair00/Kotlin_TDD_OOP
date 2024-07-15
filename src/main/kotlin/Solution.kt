class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun createBinaryTree(descriptions: Array<IntArray>): TreeNode? {
        // Создаем карту для хранения узлов по их значениям
        val nodeMap = mutableMapOf<Int, TreeNode>()
        // Создаем множество для хранения всех детей
        val childrenSet = mutableSetOf<Int>()

        // Проходим по всем описаниям и создаем узлы
        for (desc in descriptions) {
            val parentVal = desc[0]
            val childVal = desc[1]
            val isLeft = desc[2] == 1

            // Получаем или создаем узлы для родителя и ребенка
            val parentNode = nodeMap.getOrPut(parentVal) { TreeNode(parentVal) }
            val childNode = nodeMap.getOrPut(childVal) { TreeNode(childVal) }

            // Устанавливаем связи между родителем и ребенком
            if (isLeft) {
                parentNode.left = childNode
            } else {
                parentNode.right = childNode
            }

            // Добавляем ребенка в множество детей
            childrenSet.add(childVal)
        }

        // Находим корневой узел, который не является ребенком ни одного узла
        var root: TreeNode? = null
        for ((key, _) in nodeMap) {
            if (!childrenSet.contains(key)) {
                root = nodeMap[key]
                break
            }
        }

        return root
    }
}