import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var initialMoney = scanner.nextInt()
    var currSpending: Int
    var neededMoney = 0
    while (scanner.hasNextInt()) { // sequence of purchases
        currSpending = scanner.nextInt()
        if (initialMoney - currSpending >= 0) {
            initialMoney -= currSpending
        } else {
            neededMoney += currSpending
        }
    }
    if (neededMoney != 0) {
        println("Error, insufficient funds for the purchase. You have $initialMoney, but you need $neededMoney.")
    } else {
        println("Thank you for choosing us to manage your account! You have $initialMoney money.")
    }
}