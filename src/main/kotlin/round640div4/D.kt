package round640div4

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val a = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        var i = 0
        var j = n - 1
        var alice = 0
        var bob = 0
        var move = 0
        var min = 0
        while (true) {
            // alice
            var eat = 0
            while (true) {
                eat += a[i]
                i++
                if (j < i || eat > min) {
                    min = eat
                    alice += eat
                    break
                }
            }
            move++
            if (j < i) break
            // bob
            eat = 0
            while (true) {
                eat += a[j]
                j--
                if (j < i || eat > min) {
                    min = eat
                    bob += eat
                    break
                }
            }
            move++
            if (j < i) break
        }
        println("$move $alice $bob")
    }
}