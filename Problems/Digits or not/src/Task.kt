import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    var x = 4
    repeat(4) {
        if (scanner.next()[0].isDigit()) {
            if (x == 1) {
                print("true")
            } else {
                print("true" + "\\")
            }
        } else {
            if (x == 1) {
                print("false")
            } else {
                print("false" + "\\")
            }
        }
        x--
    }
}