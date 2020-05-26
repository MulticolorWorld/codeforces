package round645div2

import java.util.*

fun main() {
    val T = readLine()!!.toInt()
    repeat(T) {
        var N = readLine()!!.toInt()
        val A = readLine()!!.split(" ").map { it.toInt() }

        val pQueue = PriorityQueue<Int>(compareByDescending { it })
        A.forEach { pQueue.add(it) }
        while (pQueue.isNotEmpty()) {
            val m = pQueue.poll()
            if (m > N) {
                N--
                continue
            } else {
                break
            }
        }
        println(N + 1)
    }
}