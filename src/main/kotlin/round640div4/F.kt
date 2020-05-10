package round640div4

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n0, n1, n2) = readLine()!!.split(" ").map { it.toInt() }
        var ans = ""
        if (n1 == 0) {
            if (n0 != 0) {
                repeat(n0 + 1) {
                    ans += "0"
                }
            } else if (n2 != 0) {
                repeat(n2 + 1) {
                    ans += "1"
                }
            }
        } else {
            repeat(n1) {
                if (ans.isBlank()) {
                    ans += "01"
                } else if (ans.last() == '1') {
                    ans += "0"
                } else if (ans.last() == '0') {
                    ans += "1"
                }
            }
            repeat(n0) {
                ans = ans.replaceFirst("0", "00")
            }
            repeat(n2) {
                ans = ans.replaceFirst("1", "11")
            }
        }
        println(ans)
    }
}