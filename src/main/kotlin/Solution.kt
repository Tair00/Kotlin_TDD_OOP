class Solution {
    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()

        val digitMap = mapOf(
            '2' to listOf('a', 'b', 'c'),
            '3' to listOf('d', 'e', 'f'),
            '4' to listOf('g', 'h', 'i'),
            '5' to listOf('j', 'k', 'l'),
            '6' to listOf('m', 'n', 'o'),
            '7' to listOf('p', 'q', 'r', 's'),
            '8' to listOf('t', 'u', 'v'),
            '9' to listOf('w', 'x', 'y', 'z')
        )

        val result = mutableListOf<String>()
        generateCombinations(digits, 0, "", digitMap, result)
        return result
    }

    private fun generateCombinations(digits: String, index: Int, combination: String, digitMap: Map<Char, List<Char>>, result: MutableList<String>) {
        if (index == digits.length) {
            result.add(combination)
            return
        }

        val currentDigit = digits[index]
        val letters = digitMap[currentDigit] ?: return

        for (letter in letters) {
            generateCombinations(digits, index + 1, combination + letter, digitMap, result)
        }
    }
}
