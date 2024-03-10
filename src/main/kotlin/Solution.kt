fun longestPalindrome(s: String): String {
    if (s.length < 2) return s

    var start = 0
    var maxLength = 1

    for (i in s.indices) {
        var low = i - maxLength - 1
        var high = i

        while (low >= 0 && high < s.length && s[low] == s[high]) {
            if (high - low + 1 > maxLength) {
                start = low
                maxLength = high - low + 1
            }
            low--
            high++
        }

        low = i - maxLength
        high = i

        while (low >= 0 && high < s.length && s[low] == s[high]) {
            if (high - low + 1 > maxLength) {
                start = low
                maxLength = high - low + 1
            }
            low--
            high++
        }
    }

    return s.substring(start, start + maxLength)
}

fun main() {
    val s1 = "babad"
    println(longestPalindrome(s1))  // Вывод: "bab" или "aba"

    val s2 = "cbbd"
    println(longestPalindrome(s2))  // Вывод: "bb"
}
