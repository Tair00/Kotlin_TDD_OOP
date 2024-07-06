class Solution {
    fun passThePillow(n: Int, time: Int): Int {

        val fullCycles = time / (n - 1)
        val remainingTime = time % (n - 1)


        val direction = if (fullCycles % 2 == 0) 1 else -1


        val initialPosition = if (direction == 1) 1 else n


        return initialPosition + direction * remainingTime
    }
}