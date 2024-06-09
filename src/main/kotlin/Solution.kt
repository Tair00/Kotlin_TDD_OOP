class Solution {
    fun lengthOfLastWord(s: String): Int {
        var pointer = s.length - 1

        while(s[pointer] == ' ') {
            pointer -= 1
            if(pointer < 0) break
        }

        val endPointer = pointer

        while(s[pointer] != ' '){
            pointer -=1
            if(pointer < 0) break
        }

        val startPointer = pointer

        return endPointer - startPointer
    }
}