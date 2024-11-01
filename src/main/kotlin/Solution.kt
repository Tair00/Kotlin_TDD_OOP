class Solution {
    fun makeFancyString(s: String): String {
        val result = StringBuilder()

        for (i in s.indices) {
            // Добавляем текущий символ, если предыдущие два символа не такие же
            if (i < 2 || !(s[i] == s[i - 1] && s[i] == s[i - 2])) {
                result.append(s[i])
            }
        }

        return result.toString()
    }
}

