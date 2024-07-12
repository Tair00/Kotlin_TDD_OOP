class Solution {
    fun maximumGain(s: String, x: Int, y: Int): Int {
        val first = if (x >= y) 'a' to 'b' else 'b' to 'a'
        val firstPoints = if (x >= y) x else y
        val secondPoints = if (x >= y) y else x

        fun calculatePoints(s: String, a: Char, b: Char, points: Int): Pair<String, Int> {
            val stack = mutableListOf<Char>()
            var score = 0
            for (char in s) {
                if (char == b && stack.isNotEmpty() && stack.last() == a) {
                    stack.removeAt(stack.size - 1)
                    score += points
                } else {
                    stack.add(char)
                }
            }
            return stack.joinToString("") to score
        }

        val (reducedString, firstScore) = calculatePoints(s, first.first, first.second, firstPoints)
        val (_, secondScore) = calculatePoints(reducedString, first.second, first.first, secondPoints)

        return firstScore + secondScore
    }
}

