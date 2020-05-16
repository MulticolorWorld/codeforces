package round643div2

import java.util.*

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val e = readLine()!!.split(" ").map { it.toInt() }
        val pQueue = PriorityQueue<Int>(naturalOrder())
        e.forEach { pQueue.add(it) }

        var ans = 0
        var i = 0
        while (pQueue.size != 0) {
            val a = pQueue.poll()
            i++
            if (i >= a) {
                ans++
                i = 0
            }
        }
        println(ans)
    }
}