import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val one = scanner.next()
    val two = scanner.next()

    if (one[0].toLowerCase() == two[0].toLowerCase())
        println("true")
    else
        println("false")
}