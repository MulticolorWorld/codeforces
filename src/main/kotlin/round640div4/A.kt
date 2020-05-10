package round640div4

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        var n = readLine()!!.toInt()
        var i = 1
        val list = mutableListOf<Int>()
        while (n != 0) {
            val a = n % Math.pow(10.0, i.toDouble()).toInt()
            if (a != 0) {
                list.add(a)
                n -= a
            }
            i++
        }
        println(list.size)
        println(list.joinToString(separator = " "))
    }
}