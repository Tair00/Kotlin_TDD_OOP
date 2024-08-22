class Solution {
    fun findComplement(num: Int): Int {

        val mask = (1 shl num.bitLength()) - 1


        return num xor mask
    }
}

fun Int.bitLength(): Int {
    var bits = 0
    var n = this
    while (n != 0) {
        bits++
        n = n shr 1
    }
    return bits
}
