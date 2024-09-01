class Solution {
    fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
        // If the total number of elements in the original array is not equal to m * n, return an empty array
        if (original.size != m * n) {
            return emptyArray()
        }

        // Initialize a 2D array with m rows and n columns
        val result = Array(m) { IntArray(n) }

        // Fill the 2D array row by row
        for (i in original.indices) {
            val row = i / n
            val col = i % n
            result[row][col] = original[i]
        }

        return result
    }
}
