package round642div3

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, m) = readLine()!!.split(" ").map { it.toLong() }
        if (n == 1L) {
            println(0)
        } else if (n == 2L) {
            println(m)
        } else {
            println(2 * m)
        }
    }
}