import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    while (scan.hasNextInt()) {
        list.add(scan.nextInt())
    }
    val max = list.maxOrNull()
    val pos = list.indexOf(max) + 1
    println("$max $pos")
}



