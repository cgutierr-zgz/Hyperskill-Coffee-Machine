import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.next()
    val b = scanner.next()
    val c = scanner.next()
    if (a == b || a == c || b == c)
        println("false")
    else
        println("true")
}