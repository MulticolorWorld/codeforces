package round641div2

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        var (n, k) = readLine()!!.split(" ").map { it.toLong() }
        var i = 2L
        while (i != n) {
            if (n % i == 0L) {
                break
            }
            i++
        }
        n += i
        n += (k - 1) * 2
        println(n)
    }
}