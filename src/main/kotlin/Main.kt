fun main(args: Array<String>) {
 val solution = Solution()

 // Пример использования функции isValid с различными строками
 println(solution.isValid("(){}[]")) // Выведет true
 println(solution.isValid("({)}"))   // Выведет false
 println(solution.isValid("((((()")) // Выведет false
 }