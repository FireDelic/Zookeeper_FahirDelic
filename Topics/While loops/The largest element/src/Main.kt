fun main() {
    val list = mutableListOf<Int>()
    val n = readln().toInt()
    var lrgstElmnt = 0
    while (n > 0) {
        list.add(n)
    }
    if (n == 0)
        println(lrgstElmnt)
}



