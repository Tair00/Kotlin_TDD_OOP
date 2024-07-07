class Solution {
    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        var totalDrinks = 0
        var emptyBottles = 0
        var fullBottles = numBottles

        while (fullBottles > 0) {
            // Drink all current full bottles
            totalDrinks += fullBottles
            emptyBottles += fullBottles

            // Exchange empty bottles for full ones
            fullBottles = emptyBottles / numExchange
            emptyBottles = emptyBottles % numExchange
        }

        return totalDrinks
    }
}