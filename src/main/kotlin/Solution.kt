class Solution {
    fun areSentencesSimilar(sentence1: String, sentence2: String): Boolean {
        val words1 = sentence1.split(" ")
        val words2 = sentence2.split(" ")

        var i = 0
        var j = 0

        // Проверяем совпадение префиксов
        while (i < words1.size && i < words2.size && words1[i] == words2[i]) {
            i++
        }

        // Проверяем совпадение суффиксов
        while (j < words1.size - i && j < words2.size - i && words1[words1.size - 1 - j] == words2[words2.size - 1 - j]) {
            j++
        }

        // Если префиксы и суффиксы покрывают все слова в одном из предложений, то они схожи
        return i + j == words1.size || i + j == words2.size
    }
}
