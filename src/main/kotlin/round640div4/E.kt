package round640div4

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val a = readLine()!!.split(" ").map { it.toInt() }

        val aSum = IntArray(n + 1)
        aSum[1] = a[0]
        for (i in 2..n) {
            aSum[i] = aSum[i - 1] + a[i - 1]
        }
        var f = BooleanArray(8001) { false }
        for (j in 0..n - 2) {
            for (k in j + 2..n) {
                if (aSum[k] - aSum[j] <= 8000) f[aSum[k] - aSum[j]] = true
            }
        }

        var count = 0
        a.forEach {
            if (f[it]) count++
        }
        println(count)
    }
}