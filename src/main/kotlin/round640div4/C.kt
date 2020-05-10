package round640div4

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, k) = readLine()!!.split(" ").map { it.toInt() }
        var l = 1
        var r = k
        while (l / n != r / n) {
            val newL = r
            val newR = r + r / n - l / n
            l = newL
            r = newR
        }
        println(r)
    }
}