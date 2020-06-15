import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var a = scanner.next().toInt()
    var b = scanner.next().toInt()
    var c = scanner.next().toInt()

    if ((a + b) == 20 || (a + c) == 20 || (b + c) == 20) {
        println("true")
    } else {
        println("false")
    }
}