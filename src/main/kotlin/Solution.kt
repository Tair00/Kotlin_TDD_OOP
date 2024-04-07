class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1 || s.length <= numRows) return s

        val result = Array(numRows) { StringBuilder() }
        var index = 0
        var step = 1

        for (char in s) {
            result[index].append(char)
            if (index == 0) {
                step = 1
            } else if (index == numRows - 1) {
                step = -1
            }
            index += step
        }

        val convertedString = StringBuilder()
        for (row in result) {
            convertedString.append(row)
        }

        return convertedString.toString()
    }
}