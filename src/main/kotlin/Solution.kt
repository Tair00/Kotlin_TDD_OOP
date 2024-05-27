class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val result = mutableListOf<String>()
        generateParenthesisHelper(result, "", 0, 0, n)
        return result
    }

    private fun generateParenthesisHelper(result: MutableList<String>, current: String, open: Int, close: Int, max: Int) {
        if (current.length == max * 2) {
            result.add(current)
            return
        }

        if (open < max) {
            generateParenthesisHelper(result, current + "(", open + 1, close, max)
        }
        if (close < open) {
            generateParenthesisHelper(result, current + ")", open, close + 1, max)
        }
    }
}
