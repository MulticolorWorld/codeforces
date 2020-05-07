package round639div2

fun main() {
    val t = readLine()!!.toInt()

    repeat(t) {
        val n = readLine()!!.toInt()
        val a = readLine()!!.split(" ").map { it.toInt() }

        val f = BooleanArray(n) { false }
        for (i in 0 until n) {
            f[Math.floorMod(i + a[Math.floorMod(i, n)], n)] = true
        }
        if (f.contains(false)) println("NO") else println("YES")
    }
}