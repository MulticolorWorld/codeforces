package round640div4

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val list = mutableListOf<IntArray>()
        for (i in 1..n) {
            val used = BooleanArray(n + 1) { false }
            val s = IntArray(n)
            dfs(i, 0, n, s, used, list)
        }
        if (list.isEmpty()) {
            println(-1)
        } else {
            println(list[0].joinToString(separator = " "))
        }
    }
}

fun dfs(n: Int, i: Int, maxL: Int, s: IntArray, used: BooleanArray, list: MutableList<IntArray>) {
    s[i] = n
    used[n] = true
    if (s[maxL - 1] != 0) list.add(s)
    if (n - 4 > 0 && !used[n - 4]) dfs(n - 4, i + 1, maxL, s, used, list)
    if (n - 3 > 0 && !used[n - 3]) dfs(n - 3, i + 1, maxL, s, used, list)
    if (n - 2 > 0 && !used[n - 2]) dfs(n - 2, i + 1, maxL, s, used, list)
    if (n + 2 <= maxL && !used[n + 2]) dfs(n + 2, i + 1, maxL, s, used, list)
    if (n + 3 <= maxL && !used[n + 3]) dfs(n + 3, i + 1, maxL, s, used, list)
    if (n + 4 <= maxL && !used[n + 4]) dfs(n + 4, i + 1, maxL, s, used, list)
}