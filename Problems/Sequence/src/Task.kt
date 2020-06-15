import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.next()
    val b = scanner.next()
    val c = scanner.next()

    if (a[0] + 1 == b[0] && a[0] + 2 == c[0])
        println(true)
    else
        println(false)
}