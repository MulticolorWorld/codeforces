package round641div2

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val s = longArrayOf(0) + readLine()!!.split(" ").map { it.toLong() }.toLongArray()

        val dp = IntArray(n + 1)
        dp[1] = 1
        for (i in 2..n) {
            for (j in 1..Math.sqrt(i.toDouble()).toInt()) {
                if (i % j == 0) {
                    if (s[i] > s[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1)
                    }
                    if (s[i] > s[i / j]) {
                        dp[i] = Math.max(dp[i], dp[i / j] + 1)
                    }
                }
            }
            if (dp[i] == 0) {
                dp[i] = 1
            }
        }
        println(dp.max())
    }
}