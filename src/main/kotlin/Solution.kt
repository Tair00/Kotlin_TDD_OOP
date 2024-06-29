class Solution {
    fun getAncestors(n: Int, edges: Array<IntArray>): List<List<Int>> {
        val graph = Array(n) { mutableListOf<Int>() }
        for (edge in edges) {
            graph[edge[0]].add(edge[1])
        }

        // Шаг 2: Создание массива для хранения предков
        val ancestors = Array(n) { mutableSetOf<Int>() }

        // Шаг 3: Выполнение DFS для каждого узла
        fun dfs(node: Int, currentAncestor: Int) {
            for (neighbor in graph[node]) {
                if (ancestors[neighbor].add(currentAncestor)) {
                    dfs(neighbor, currentAncestor)
                }
            }
        }

        // Запуск DFS для каждого узла
        for (i in 0 until n) {
            dfs(i, i)
        }

        // Шаг 4: Сортировка списка предков для каждого узла
        return ancestors.map { it.sorted() }
    }
}

