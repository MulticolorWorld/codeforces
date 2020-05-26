package round645div2

fun main() {
    val T = readLine()!!.toInt()
    repeat(T) {
        val (N, M) = readLine()!!.split(" ").map(String::toInt)
        println((N * M + 1) / 2)
    }
}