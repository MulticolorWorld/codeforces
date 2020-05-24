package round644div3

import kotlin.math.sqrt

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, k) = readLine()!!.split(" ").map(String::toInt)
        val list = mutableListOf<Int>()
        for (i in 1..sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                list.add(i)
                list.add(n / i)
            }
        }
        list.filter { it <= k }.sorted().let {
            println(n / it.max()!!)
        }
    }
}