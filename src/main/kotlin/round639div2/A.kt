package round639div2

fun main() {
    val t = readLine()!!.toInt()

    for (i in 0 until t) {
        val (m, n) = readLine()!!.split(" ").map { it.toInt() }
        if (m == 2 && n == 2) {
            println("YES")
        } else if (m == 1 || n == 1) {
            println("YES")
        } else {
            println("NO")
        }
    }
}