class Solution {
    fun countAndSay(n: Int): String {
        if (n == 1) return "1"

        var result = "1"

        for (i in 2..n) {
            result = getNextSequence(result)
        }

        return result
    }

    private fun getNextSequence(s: String): String {
        val sb = StringBuilder()
        var count = 1

        for (i in 1 until s.length) {
            if (s[i] == s[i - 1]) {
                count++
            } else {
                sb.append(count).append(s[i - 1])
                count = 1
            }
        }

        // Добавляем последнюю группу
        sb.append(count).append(s.last())

        return sb.toString()
    }
}