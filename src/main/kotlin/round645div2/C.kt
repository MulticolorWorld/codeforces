package round645div2

import kotlin.math.max
import kotlin.math.min

fun main() {
    val T = readLine()!!.toInt()
    repeat(T) {
        val (X1, Y1, X2, Y2) = readLine()!!.split(" ").map { it.toLong() }
        val w = X2 - X1 + 1
        val h = Y2 - Y1 + 1
        if (w == 1L || h == 1L) {
            println(1)
            return@repeat
        }
        if (w == h) {
            println(w * (w - 1) / 2 + (w - 1) * (w - 2) / 2 + 1)
            return@repeat
        }
        if (w != h) {
            val min = min(w, h)
            val max = max(w, h)
            println(min * (min - 1) + (min - 1) * (max - min - 1) + 1)
            return@repeat
        }
    }
}