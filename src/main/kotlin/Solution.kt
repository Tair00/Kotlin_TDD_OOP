class Solution {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {

        val nameHeightPairs = mutableListOf<Pair<String, Int>>()
        for (i in names.indices) {
            nameHeightPairs.add(names[i] to heights[i])
        }

        nameHeightPairs.sortByDescending { it.second }

        val sortedNames = nameHeightPairs.map { it.first }.toTypedArray()

        return sortedNames
    }
}
