import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    when {
        n == 0 || n == 1 || n == 2 || n == 3 || n == 5 || n == 8 || n == 13 || n == 21 || n == 34 || n == 55 -> println("F")
        n == 0 || n == 1 || n == 3 || n == 6 || n == 10 || n == 15 || n == 21 || n == 28 || n == 36 || n == 45 -> println("T")
        n == 1 || n == 10 || n == 100 || n == 1000 || n == 10000 || n == 100000 -> println("P")
        else -> println("N")
    }
}
