package round642div3

fun main() {
    val t = readLine()!!.toInt()
    val dp = LongArray(5 * 100000 + 1) { -1 }
    var i = 3
    dp[1] = 0
    while (i < 5 * 100000) {
        dp[i] = dp[i - 2] + (i / 2L) * (4L * i - 4L)
        i += 2
    }
    repeat(t) {
        val n = readLine()!!.toInt()
        println(dp[n])
    }
}