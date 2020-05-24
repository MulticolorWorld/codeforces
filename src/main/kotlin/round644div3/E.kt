package round644div3

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val p = Array(n) { readLine()!! }

        var f = true
        for (i in 0 until n - 1) {
            for (j in 0 until n - 1) {
                if (p[i][j] == '1' && p[i + 1][j] == '0' && p[i][j + 1] == '0') {
                    f = false
                }
            }
        }
        if (f) {
            println("YES")
        } else {
            println("NO")
        }
    }
}