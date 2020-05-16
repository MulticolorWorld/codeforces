package round643div2

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        var (a, k) = readLine()!!.split(" ").map { it.toLong() }
        var i = 1
        while (!a.toString().contains('0') && i < k) {
            a += a.toString().map { it.toString().toInt() }.let { it.max()!! * it.min()!! }
            i++
        }
        println(a)
    }
}