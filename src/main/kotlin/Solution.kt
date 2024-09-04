class Solution {
    fun robotSim(commands: IntArray, obstacles: Array<IntArray>): Int {

        val directions = arrayOf(
            intArrayOf(0, 1),  // north
            intArrayOf(1, 0),  // east
            intArrayOf(0, -1), // south
            intArrayOf(-1, 0)  // west
        )

        var x = 0
        var y = 0
        var direction = 0


        val obstacleSet = obstacles.map { it[0] to it[1] }.toSet()


        var maxDistanceSquared = 0

        for (command in commands) {
            when (command) {
                -2 -> {
                    // Turn left
                    direction = (direction + 3) % 4
                }
                -1 -> {

                    direction = (direction + 1) % 4
                }
                else -> {

                    for (step in 1..command) {
                        val nextX = x + directions[direction][0]
                        val nextY = y + directions[direction][1]
                        if (obstacleSet.contains(nextX to nextY)) {
                            break
                        }
                        x = nextX
                        y = nextY
                    }
                    val distanceSquared = x * x + y * y
                    if (distanceSquared > maxDistanceSquared) {
                        maxDistanceSquared = distanceSquared
                    }
                }
            }
        }

        return maxDistanceSquared
    }
}