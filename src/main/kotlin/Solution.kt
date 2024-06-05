class Solution {

    fun minimumChairs(s: String): Int {
        var currentPeople = 0
        var maxPeople = 0

        for (char in s) {
            if (char == 'E') {
                currentPeople++
                if (currentPeople > maxPeople) {
                    maxPeople = currentPeople
                }
            } else if (char == 'L') {
                currentPeople--
            }
        }

        return maxPeople
    }
}