package round642div3

import java.util.*

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val a = IntArray(n + 1)
        val comparator = compareBy<Pair<Int, Int>> { it.second - it.first }.thenByDescending { it.first }.reversed()
        val pQueue = PriorityQueue(comparator)
        pQueue.add(Pair(1, n))
        for (i in 1..n) {
            var sub = pQueue.poll()
            var at = if ((sub.second - sub.first + 1) % 2 == 1) {
                (sub.first + sub.second) / 2
            } else {
                (sub.first + sub.second - 1) / 2
            }
            a[at] = i
            if (sub.first == sub.second) {

            } else if (sub.first == at) {
                pQueue.offer(Pair(sub.first + 1, sub.second))
            } else {
                pQueue.offer(Pair(sub.first, at - 1))
                pQueue.offer(Pair(at + 1, sub.second))
            }
        }
        println(a.takeLast(n).joinToString(separator = " "))
    }
}