import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val x = scanner.next()
    if (x[0].isUpperCase() || x[0].isDigit()) {
        if (x[0].isDigit()) {
            if (x[0] == '0') {
                println(false)
            } else {
                println(true)
            }
        } else if (x[0].isUpperCase()) {
            println(true)
        } else {
            println(false)
        }
    } else {
        println(false)
    }
}