class Solution {
    fun spiralMatrixIII(rows: Int, cols: Int, rStart: Int, cStart: Int): Array<IntArray> {
        val result = mutableListOf<IntArray>()
        val directions = arrayOf(
            intArrayOf(0, 1),  // вправо
            intArrayOf(1, 0),  // вниз
            intArrayOf(0, -1), // влево
            intArrayOf(-1, 0)  // вверх
        )
        var r = rStart
        var c = cStart
        var steps = 1
        var directionIndex = 0

        result.add(intArrayOf(r, c))
        while (result.size < rows * cols) {
            val dir = directions[directionIndex]
            for (i in 0 until steps) {
                r += dir[0]
                c += dir[1]
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    result.add(intArrayOf(r, c))
                }
            }
            directionIndex = (directionIndex + 1) % 4
            if (directionIndex == 0 || directionIndex == 2) {
                steps++
            }
        }
        return result.toTypedArray()
    }
}
