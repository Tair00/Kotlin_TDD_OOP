class Solution {
    fun minOperations(logs: Array<String>): Int {
        var depth = 0
        for (log in logs) {
            when (log) {
                "../" -> if (depth > 0) depth--
                "./" -> continue
                else -> depth++
            }
        }
        return depth
    }
}