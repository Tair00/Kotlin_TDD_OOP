class Solution {
    fun minBitFlips(start: Int, goal: Int): Int {
        val c = start.xor(goal)
        var pp = 1
        var r = 0
        while (pp <= c) {
            var d = pp.and(c)
            if (d != 0) {
                r++
            }
            pp *= 2
        }
        return r
    }
}