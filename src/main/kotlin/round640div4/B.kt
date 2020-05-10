package round640div4

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, k) = readLine()!!.split(" ").map { it.toInt() }
        val list = mutableListOf<Int>()
        // even
        val x = n - (k - 1) * 2
        if (x > 0 && x % 2 == 0) {
            repeat(k - 1) {
                list.add(2)
            }
            list.add(x)
        }
        if (list.isEmpty()) {
            // odd
            val y = n - (k - 1)
            if (y > 0 && y % 2 == 1) {
                repeat(k - 1) {
                    list.add(1)
                }
                list.add(y)
            }
        }
        if (list.isEmpty()) {
            println("NO")
        } else {
            println("YES")
            println(list.joinToString(separator = " "))
        }
    }
}