
class Solution {
    fun intToRoman(num: Int): String {
        val decimalValues = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val romanSymbols = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

        var result = ""
        var remaining = num

        for (i in decimalValues.indices) {
            while (remaining >= decimalValues[i]) {
                result += romanSymbols[i]
                remaining -= decimalValues[i]
            }
        }

        return result
    }
}