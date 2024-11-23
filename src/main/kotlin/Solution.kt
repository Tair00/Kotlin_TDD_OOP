class Solution {
    fun rotateTheBox(box: Array<CharArray>): Array<CharArray> {
        val m = box.size
        val n = box[0].size

        for (row in box) {
            var empty = row.size - 1
            for (col in row.size - 1 downTo 0) {
                when (row[col]) {
                    '#' -> {
                        row[col] = '.'
                        row[empty] = '#'
                        empty--
                    }
                    '*' -> empty = col - 1
                }
            }
        }

        val rotatedBox = Array(n) { CharArray(m) }
        for (i in 0 until m) {
            for (j in 0 until n) {
                rotatedBox[j][m - 1 - i] = box[i][j]
            }
        }

        return rotatedBox
    }

}