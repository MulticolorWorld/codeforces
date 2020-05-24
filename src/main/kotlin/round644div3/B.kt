package round644div3

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val s = readLine()!!.split(" ").map(String::toInt).sorted()
        (1 until n).map { s[it] - s[it - 1] }.min()?.let { println(it) }
    }
}