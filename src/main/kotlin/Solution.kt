
    fun pivotInteger(n: Int): Int {
        var sum = 0
        var leftSum = 0

        for (i in 1..n) {
            sum += i
        }

        for (i in 1..n) {
            sum -= i
            if (leftSum == sum) {
                return i
            }
            leftSum += i
        }


        return -1
    }


fun main() {
}
