class Solution {
    data class Robot(val index: Int, var position: Int, var health: Int, val direction: Char)

    fun survivedRobotsHealths(positions: IntArray, healths: IntArray, directions: String): List<Int> {
        val n = positions.size
        val robots = Array(n) { i -> Robot(i, positions[i], healths[i], directions[i]) }

        // Сортируем роботов по позиции
        robots.sortBy { it.position }

        val stack = mutableListOf<Robot>()

        for (robot in robots) {
            if (robot.direction == 'R') {
                stack.add(robot)
            } else {
                while (stack.isNotEmpty() && stack.last().direction == 'R') {
                    val topRobot = stack.last()
                    if (topRobot.health > robot.health) {
                        topRobot.health -= 1
                        robot.health = 0
                        break
                    } else if (topRobot.health < robot.health) {
                        stack.removeAt(stack.size - 1)
                        robot.health -= 1
                    } else {
                        stack.removeAt(stack.size - 1)
                        robot.health = 0
                        break
                    }
                }
                if (robot.health > 0) {
                    stack.add(robot)
                }
            }
        }

        // Сортируем выживших роботов по их исходным индексам
        val survivedRobots = stack.filter { it.health > 0 }.sortedBy { it.index }

        return survivedRobots.map { it.health }
    }
}