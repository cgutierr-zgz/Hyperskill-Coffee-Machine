import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextLong()
    val op = scanner.next()
    val n2 = scanner.nextLong()
    val zero: Long = 0
    when {
        op == "/" && n2 == zero -> println("Division by 0!")
        op == "+" -> println(n + n2)
        op == "-" -> println(n - n2)
        op == "/" -> println(n / n2)
        op == "*" -> println(n * n2)
        else -> println("Unknown operator")
    }
}