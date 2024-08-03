class Solution {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        // Сортируем оба массива и проверяем их на равенство
        target.sort()
        arr.sort()
        return target.contentEquals(arr)
    }
}
