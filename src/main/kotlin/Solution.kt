class Solution {
    fun minimumPushes(word: String): Int {
        val frequencyMap = mutableMapOf<Char, Int>()


        for (c in word) {
            frequencyMap[c] = frequencyMap.getOrDefault(c, 0) + 1
        }

        val frequencyList = mutableListOf<Pair<Char, Int>>()
        for ((char, freq) in frequencyMap) {
            frequencyList.add(Pair(char, freq))
        }

        frequencyList.sortByDescending { it.second }

        var ans = 0
        var i = 1

        for (j in frequencyList.indices) {
            if (j > 7 && j % 8 == 0) {
                i++
            }
            ans += i * frequencyList[j].second
        }

        return ans
    }
}