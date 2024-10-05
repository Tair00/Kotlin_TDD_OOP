class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val len1 = s1.length
        val len2 = s2.length

        if (len1 > len2) return false

        val count1 = IntArray(26)
        val count2 = IntArray(26)
        for (i in s1.indices) {
            count1[s1[i] - 'a']++
            count2[s2[i] - 'a']++
        }

        if (count1 contentEquals count2) return true

        for (i in len1 until len2) {

            count2[s2[i] - 'a']++

            count2[s2[i - len1] - 'a']--

            if (count1 contentEquals count2) return true
        }

        return false
    }
}
