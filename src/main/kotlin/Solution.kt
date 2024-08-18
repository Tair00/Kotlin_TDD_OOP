class Solution {
    fun nthUglyNumber(n: Int): Int {
        val uglyNumbers = IntArray(n)
        uglyNumbers[0] = 1
        var i2 = 0
        var i3 = 0
        var i5 = 0

        var nextMultipleOf2 = 2
        var nextMultipleOf3 = 3
        var nextMultipleOf5 = 5

        for (i in 1 until n) {
            val nextUgly = minOf(nextMultipleOf2, nextMultipleOf3, nextMultipleOf5)
            uglyNumbers[i] = nextUgly

            if (nextUgly == nextMultipleOf2) {
                i2++
                nextMultipleOf2 = uglyNumbers[i2] * 2
            }
            if (nextUgly == nextMultipleOf3) {
                i3++
                nextMultipleOf3 = uglyNumbers[i3] * 3
            }
            if (nextUgly == nextMultipleOf5) {
                i5++
                nextMultipleOf5 = uglyNumbers[i5] * 5
            }
        }

        return uglyNumbers[n - 1]
    }
}
