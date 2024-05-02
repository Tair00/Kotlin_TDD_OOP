import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for (char in s) {
            if (char == '(' || char == '[' || char == '{') {
                stack.push(char)
            } else {
                if (stack.isEmpty()) {
                    return false // Если стек пустой и мы встречаем закрывающую скобку, строка недопустима
                }

                val lastOpen = stack.pop()

                // Проверяем соответствие открытой и закрывающей скобок
                if ((char == ')' && lastOpen != '(') ||
                    (char == ']' && lastOpen != '[') ||
                    (char == '}' && lastOpen != '{')) {
                    return false
                }
            }
        }

        // Проверяем, что стек пуст после обхода всей строки
        return stack.isEmpty()
    }
}
