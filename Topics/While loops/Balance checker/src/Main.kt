import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var newBalance = 0
    while (scanner.hasNextInt()) {
        val listOfPurch = mutableListOf<Int>()
        listOfPurch.add(scanner.nextInt())
        for (purchase in listOfPurch) {
            newBalance = balance - purchase
            balance = newBalance
        }
        if (balance < newBalance) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $newBalance.")
        }
    }
    if (balance >= 0) println("Thank you for choosing us to manage your account! Your balance is $balance.")
}


