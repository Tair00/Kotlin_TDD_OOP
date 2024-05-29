class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        backtrack(nums.toMutableList(), mutableListOf(), result)
        return result
    }

    private fun backtrack(nums: MutableList<Int>, path: MutableList<Int>, result: MutableList<List<Int>>) {
        if (nums.isEmpty()) {
            result.add(ArrayList(path))
            return
        }

        for (i in nums.indices) {
            val num = nums.removeAt(i)
            path.add(num)
            backtrack(nums, path, result)
            path.removeAt(path.size - 1)
            nums.add(i, num)
        }
    }
}
