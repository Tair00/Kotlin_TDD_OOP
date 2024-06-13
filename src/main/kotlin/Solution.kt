class Solution {
    fun minMovesToSeat(seats: IntArray, students: IntArray): Int {

        seats.sort()
        students.sort()


        var totalMoves = 0


        for (i in seats.indices) {
            totalMoves += Math.abs(seats[i] - students[i])
        }

        return totalMoves
    }
}
