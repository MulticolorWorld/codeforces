package round644div3

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, m, a, b) = readLine()!!.split(" ").map(String::toInt)
        if (n * a != m * b) {
            println("NO")
            return@repeat
        }

        var shift = 1
        while (shift * n % m != 0) {
            shift++
        }
        val matrix = Array(n) { IntArray(m) { 0 } }
        var dx = 0
        for (i in 0 until n) {
            for (j in 0 until a) {
                matrix[i][(j + dx) % m] = 1
            }
            dx += shift
        }
        println("YES")
        matrix.forEach {
            println(it.joinToString(separator = ""))
        }
    }
}