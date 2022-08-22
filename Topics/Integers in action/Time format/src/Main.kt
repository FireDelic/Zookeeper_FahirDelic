fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    val minutes = totalSeconds / 60 % 60
    val hours = totalSeconds / 3600 % 24
    val days = totalSeconds / 86400
    val seconds = (totalSeconds - (totalSeconds - days)) % 60
    println("$hours:$minutes:$seconds")
}