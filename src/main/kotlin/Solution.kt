class Solution {
    private val belowTwenty = arrayOf(
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
        "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    )
    private val tens = arrayOf(
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    )
    private val thousands = arrayOf(
        "", "Thousand", "Million", "Billion"
    )

    fun numberToWords(num: Int): String {
        if (num == 0) return "Zero"

        var num = num
        var result = ""
        var i = 0

        while (num > 0) {
            if (num % 1000 != 0) {
                result = helper(num % 1000) + thousands[i] + " " + result
            }
            num /= 1000
            i++
        }

        return result.trim()
    }

    private fun helper(num: Int): String {
        if (num == 0) {
            return ""
        } else if (num < 20) {
            return belowTwenty[num] + " "
        } else if (num < 100) {
            return tens[num / 10] + " " + helper(num % 10)
        } else {
            return belowTwenty[num / 100] + " Hundred " + helper(num % 100)
        }
    }
}
