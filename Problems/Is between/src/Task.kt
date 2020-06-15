import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.next().toInt()
    var b = scanner.next().toInt()
    var c = scanner.next().toInt()

    if (c > b) {
        val aux: Int = c
        c = b
        b = aux
    }
    if (a <= b && a >= c)
        println("true")
    else
        println("false")

}