class Solution {
    fun reverseParentheses(s: String): String {
        val stack = mutableListOf<StringBuilder>()
        stack.add(StringBuilder())

        for (char in s) {
            when (char) {
                '(' -> stack.add(StringBuilder())
                ')' -> {
                    val top = stack.removeAt(stack.size - 1)
                    stack.last().append(top.reverse())
                }
                else -> stack.last().append(char)
            }
        }

        return stack.first().toString()
    }
}