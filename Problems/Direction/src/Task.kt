import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    when {
        n == 1 -> println("move up")
        n == 2 -> println("move down")
        n == 3 -> println("move left")
        n == 4 -> println("move right")
        n == 0 -> println("do not move")
        else -> println("error!")
    }
}