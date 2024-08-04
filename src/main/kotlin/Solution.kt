class Solution {
    fun rangeSum(nums: IntArray, n: Int, left: Int, right: Int): Int {
        val mod = 1_000_000_007
        val sums = mutableListOf<Int>()

        // Создание всех возможных сумм подмассивов
        for (i in nums.indices) {
            var currentSum = 0
            for (j in i until nums.size) {
                currentSum += nums[j]
                sums.add(currentSum)
            }
        }

        // Сортировка сумм
        sums.sort()

        // Подсчет суммы элементов от left до right
        var result = 0
        for (i in (left - 1) until right) {
            result = (result + sums[i]) % mod
        }

        return result
    }
}
