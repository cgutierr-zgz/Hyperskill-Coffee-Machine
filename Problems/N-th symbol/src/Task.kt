import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()
    val n = scanner.next().toInt()
    // write your code here
    println("Symbol # ${n} of the string \"${str}\" is '${str[n - 1]}'")
}