class Solution {
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val used = BooleanArray(nums.size)
        nums.sort()
        backtrack(nums, mutableListOf(), used, result)
        return result
    }

    private fun backtrack(nums: IntArray, current: MutableList<Int>, used: BooleanArray, result: MutableList<List<Int>>) {
        if (current.size == nums.size) {
            result.add(ArrayList(current))
            return
        }

        for (i in nums.indices) {
            if (used[i]) continue
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue

            used[i] = true
            current.add(nums[i])
            backtrack(nums, current, used, result)
            current.removeAt(current.size - 1)
            used[i] = false
        }
    }
}
