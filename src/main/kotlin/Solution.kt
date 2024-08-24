class Solution {
    fun nearestPalindromic(n: String): String {
        val length = n.length
        val candidates = mutableSetOf<Long>()


        candidates.add(Math.pow(10.0, (length - 1).toDouble()).toLong() - 1)  // 999..999
        candidates.add(Math.pow(10.0, length.toDouble()).toLong() + 1)       // 100..001


        val prefix = n.substring(0, (length + 1) / 2).toLong()

        for (i in -1..1) {
            val newPrefix = (prefix + i).toString()
            val candidate = if (length % 2 == 0) {
                newPrefix + newPrefix.reversed()
            } else {
                newPrefix + newPrefix.dropLast(1).reversed()
            }
            candidates.add(candidate.toLong())
        }


        candidates.remove(n.toLong())


        var nearest = -1L
        for (candidate in candidates) {
            if (nearest == -1L || Math.abs(candidate - n.toLong()) < Math.abs(nearest - n.toLong()) ||
                (Math.abs(candidate - n.toLong()) == Math.abs(nearest - n.toLong()) && candidate < nearest)) {
                nearest = candidate
            }
        }

        return nearest.toString()
    }
}