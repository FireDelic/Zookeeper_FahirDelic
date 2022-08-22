import kotlin.time.measureTimedValue

fun main() {
    val hoursA = readln().toLong()
    val minutesA = readln().toLong()
    val secondsA = readln().toLong()
    val hoursB = readln().toLong()
    val minutesB = readln().toLong()
    val secondsB = readln().toLong()
    val sekundenTotalA = (hoursA * 3600) + minutesA * 60 + secondsA
    val sekundenTotalB = (hoursB * 3600) + minutesB * 60 + secondsB
    val result = sekundenTotalB - sekundenTotalA
    println(result)
}
