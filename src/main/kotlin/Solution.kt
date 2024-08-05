class Solution {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        val countMap = mutableMapOf<String, Int>()

        // Подсчет количества вхождений каждой строки
        for (str in arr) {
            countMap[str] = countMap.getOrDefault(str, 0) + 1
        }

        // Поиск k-й уникальной строки
        var distinctCount = 0
        for (str in arr) {
            if (countMap[str] == 1) {
                distinctCount++
                if (distinctCount == k) {
                    return str
                }
            }
        }

        // Если уникальных строк меньше k, возвращаем пустую строку
        return ""
    }
}
