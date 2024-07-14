class Solution {
    fun countOfAtoms(formula: String): String {
        val stack = mutableListOf<MutableMap<String, Int>>()
        var i = 0
        val n = formula.length
        var currentMap = mutableMapOf<String, Int>()

        while (i < n) {
            when (formula[i]) {
                '(' -> {
                    stack.add(currentMap)
                    currentMap = mutableMapOf()
                    i++
                }
                ')' -> {
                    val tempMap = currentMap
                    currentMap = stack.removeAt(stack.size - 1)
                    i++
                    var start = i
                    while (i < n && formula[i].isDigit()) i++
                    val count = if (start < i) formula.substring(start, i).toInt() else 1
                    for ((key, value) in tempMap) {
                        currentMap[key] = currentMap.getOrDefault(key, 0) + value * count
                    }
                }
                else -> {
                    var start = i
                    i++
                    while (i < n && formula[i].isLowerCase()) i++
                    val name = formula.substring(start, i)
                    start = i
                    while (i < n && formula[i].isDigit()) i++
                    val count = if (start < i) formula.substring(start, i).toInt() else 1
                    currentMap[name] = currentMap.getOrDefault(name, 0) + count
                }
            }
        }

        val result = StringBuilder()
        val sortedKeys = currentMap.keys.sorted()
        for (key in sortedKeys) {
            result.append(key)
            if (currentMap[key]!! > 1) {
                result.append(currentMap[key])
            }
        }

        return result.toString()
    }
}