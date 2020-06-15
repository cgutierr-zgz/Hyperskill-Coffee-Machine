import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val range = scanner.nextInt()..scanner.nextInt()
    val range2 = scanner.nextInt()..scanner.nextInt()
    val n = scanner.nextInt()
    println(n in range || n in range2)
}