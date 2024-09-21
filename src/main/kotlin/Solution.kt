class Solution {
    fun lexicalOrder(n: Int): List<Int> {
        val result = mutableListOf<Int>()
        var current = 1

        for (i in 1..n) {
            result.add(current)
            if (current * 10 <= n) {
                current *= 10
            } else {
                if (current >= n) {
                    current /= 10
                }
                current += 1
                while (current % 10 == 0) {
                    current /= 10
                }
            }
        }
        return result
    }
}