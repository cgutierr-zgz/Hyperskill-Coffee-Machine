import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val element = scanner.nextInt()
    var n = 0
    var x: Int
    repeat(element) {
        x = scanner.nextInt()
        if (x % 4 == 0)
            if (x > n)
                n = x
    }
    println(n)
}