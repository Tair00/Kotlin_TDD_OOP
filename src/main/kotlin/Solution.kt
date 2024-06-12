class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        candidates.sort() // Опционально, для оптимизации
        findCombinations(candidates, target, 0, mutableListOf(), result)
        return result
    }

    private fun findCombinations(
        candidates: IntArray,
        target: Int,
        start: Int,
        currentCombination: MutableList<Int>,
        result: MutableList<List<Int>>
    ) {
        if (target == 0) {
            result.add(ArrayList(currentCombination)) // Найдено корректное решение
            return
        }

        for (i in start until candidates.size) {
            if (candidates[i] > target) break // Оптимизация: если число больше цели, нет смысла продолжать

            currentCombination.add(candidates[i])
            findCombinations(candidates, target - candidates[i], i, currentCombination, result)
            currentCombination.removeAt(currentCombination.size - 1) // Возврат к предыдущему состоянию
        }
    }
}
