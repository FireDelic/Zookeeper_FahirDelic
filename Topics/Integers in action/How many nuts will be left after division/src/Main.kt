import java.lang.Integer.sum

fun main() {
    val n = readln().toInt()
    val k = readln().toInt()
    val leftNuts = k % n
    println(leftNuts)
}