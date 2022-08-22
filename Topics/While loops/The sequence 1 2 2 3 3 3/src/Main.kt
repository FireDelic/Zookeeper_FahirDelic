fun main() {
    var counter = 0
    var n = 1
    val listMax = readln().toInt()
    val list = mutableListOf<Int>()
    do {
        var repetitions = if (listMax >= n + list.size) n else listMax - list.size
        repeat(repetitions) { list.add(n) }
        n++
        counter++
    } while (list.size < listMax)
    for (i in list) print("$i ")
}
