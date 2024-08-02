class Solution {
    fun minSwaps(nums: IntArray): Int {
        val totalOnes = nums.count { it == 1 }
        if (totalOnes == 0) return 0 // Нет 1 в массиве
        if (totalOnes == nums.size) return 0 // Все элементы равны 1

        val n = nums.size
        var currentZeros = 0
        var minSwaps = Int.MAX_VALUE

        // Рассмотрим первое окно
        for (i in 0 until totalOnes) {
            if (nums[i] == 0) currentZeros++
        }
        minSwaps = currentZeros

        // Используем скользящее окно для прохода по массиву
        for (i in 1 until n) {
            if (nums[(i - 1) % n] == 0) currentZeros--
            if (nums[(i + totalOnes - 1) % n] == 0) currentZeros++
            minSwaps = minOf(minSwaps, currentZeros)
        }

        return minSwaps
    }
}
