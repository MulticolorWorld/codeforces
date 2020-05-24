package round644div3

import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (a, b) = readLine()!!.split(" ").map(String::toInt)
        println(max(min(a, b) * 2, max(a, b)).toDouble().pow(2).toInt())
    }
}