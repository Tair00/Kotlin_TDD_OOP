import kotlin.math.abs

class Solution {
    fun fractionAddition(expression: String): String {
        var numerator = 0
        var denominator = 1
        var index = 0

        while (index < expression.length) {

            var sign = 1
            if (expression[index] == '-' || expression[index] == '+') {
                if (expression[index] == '-') sign = -1
                index++
            }


            var currentNumerator = 0
            while (index < expression.length && expression[index].isDigit()) {
                currentNumerator = currentNumerator * 10 + (expression[index] - '0')
                index++
            }
            currentNumerator *= sign


            index++

            var currentDenominator = 0
            while (index < expression.length && expression[index].isDigit()) {
                currentDenominator = currentDenominator * 10 + (expression[index] - '0')
                index++
            }


            numerator = numerator * currentDenominator + currentNumerator * denominator
            denominator *= currentDenominator

            val gcd = gcd(abs(numerator), denominator)
            numerator /= gcd
            denominator /= gcd
        }

        return "$numerator/$denominator"
    }

    private fun gcd(a: Int, b: Int): Int {
        if (b == 0) return a
        return gcd(b, a % b)
    }
}
