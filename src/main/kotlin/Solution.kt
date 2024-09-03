class Solution {
    fun getLucky(s: String, k: Int): Int {

        var numString = s.map { (it - 'a' + 1).toString() }.joinToString("")

        var result = numString.map { it.toString().toInt() }.sum()

        for (i in 1 until k) {
            result = result.toString().map { it.toString().toInt() }.sum()
        }

        return result
    }
}
