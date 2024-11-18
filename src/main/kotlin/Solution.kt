class Solution {
    fun decrypt(code: IntArray, k: Int): IntArray {
        val n = code.size
        if (k == 0) return IntArray(n) { 0 }

        val result = IntArray(n)
        val extended = code + code
        for (i in code.indices) {
            if (k > 0) {
                result[i] = (1..k).sumOf { extended[i + it] }
            } else {
                result[i] = (-1 downTo k).sumOf { extended[i + n + it] }
            }
        }

        return result
    }
}
