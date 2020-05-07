package round639div2

fun main() {
    val t = readLine()!!.toInt()
    val nn = LongArray(t) { readLine()!!.toLong() }

    val sum = LongArray(30000) { 10e9.toLong() }
    sum[0] = 0
    for (i in 1 until 30000) {
        val s = (3L * i + 1) * i / 2
        if (s <= 10e9) {
            sum[i] = s
        } else {
            break
        }
    }

    for (i in 0 until t) {
        var n = nn[i]
        var ans = 0
        while (n > 1) {
            n -= sum.findLast { it <= n }!!
            ans++
        }
        println(ans)
    }
}