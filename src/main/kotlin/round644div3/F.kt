package round644div3

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, m) = readLine()!!.split(" ").map(String::toInt)
        val a = Array(n) { readLine()!! }

        for (i in 0 until m) {
            var d = 'a'
            while (d <= 'z') {
                val s = a[0].replaceRange(i..i, d.toString())
                var f = true
                for (j in 0 until n) {
                    if ((0 until m).filter { s[it] != a[j][it] }.size > 1) {
                        f = false
                    }
                }
                if (f) {
                    println(s)
                    return@repeat
                }
                d++
            }
        }
        println(-1)
    }
}