class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun spiralMatrix(m: Int, n: Int, head: ListNode?): Array<IntArray> {

        val matrix = Array(m) { IntArray(n) { -1 } }
        var current = head

        val directions = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 0),
            intArrayOf(0, -1),
            intArrayOf(-1, 0)
        )

        var dirIndex = 0
        var row = 0
        var col = 0
        var total = m * n
        var step = 0
        while (current != null && step < total) {
            matrix[row][col] = current.`val`
            current = current.next
            step++

            val nextRow = row + directions[dirIndex][0]
            val nextCol = col + directions[dirIndex][1]

            if (nextRow in 0 until m && nextCol in 0 until n && matrix[nextRow][nextCol] == -1) {
                row = nextRow
                col = nextCol
            } else {
                dirIndex = (dirIndex + 1) % 4
                row += directions[dirIndex][0]
                col += directions[dirIndex][1]
            }
        }

        return matrix
    }
}
