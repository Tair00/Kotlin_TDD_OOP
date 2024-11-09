import kotlin.math.log2

class Solution {
    fun minEnd(n: Int, x: Int): Long {
        val kMaxBit = (log2(n.toDouble()) + log2(x.toDouble()) + 2).toInt()
        val k = (n - 1).toLong()
        var ans = x.toLong()
        var kBinaryIndex = 0

        for (i in 0 until kMaxBit) {
            if ((ans shr i and 1) == 0L) {

                if ((k shr kBinaryIndex) and 1L == 1L) {
                    ans = ans or (1L shl i)
                }
                kBinaryIndex++
            }
        }

        return ans
    }
}