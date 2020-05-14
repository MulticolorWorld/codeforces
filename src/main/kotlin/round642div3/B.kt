package round642div3

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, k) = readLine()!!.split(" ").map { it.toInt() }
        val a = readLine()!!.split(" ").map { it.toInt() }.sorted().toIntArray()
        val b = readLine()!!.split(" ").map { it.toInt() }.sorted().toIntArray()
        repeat(k) {
            if (a[0] < b[n - 1]) {
                val tmp = a[0]
                a[0] = b[n - 1]
                b[n - 1] = tmp
                a.sort()
                b.sort()
            }
        }
        println(a.sum())
    }
}