
class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        generateSubsets(0, nums, mutableListOf(), result)
        return result
    }

    private fun generateSubsets(index: Int, nums: IntArray, current: MutableList<Int>, result: MutableList<List<Int>>) {
        // Добавляем текущий набор в результат
        result.add(ArrayList(current))

        for (i in index until nums.size) {
            // Добавляем элемент nums[i] в текущее подмножество
            current.add(nums[i])
            // Рекурсивно вызываем для следующего индекса
            generateSubsets(i + 1, nums, current, result)
            // Убираем последний элемент для возврата к предыдущему состоянию
            current.removeAt(current.size - 1)
        }
    }
}