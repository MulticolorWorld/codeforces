package round644div3

import kotlin.math.abs

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val a = readLine()!!.split(" ").map(String::toInt)

        val even = a.filter { it % 2 == 0 }
        val odd = a.filter { it % 2 == 1 }
        if (even.size % 2 == 0 && odd.size % 2 == 0) {
            println("YES")
        } else {
            var f = false
            even.forEach { e ->
                odd.forEach { o ->
                    if (abs(e - o) == 1) {
                        f = true
                    }
                }
            }
            if (f) {
                println("YES")
            } else {
                println("NO")
            }
        }
    }
}