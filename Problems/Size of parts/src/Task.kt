import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var larger = 0 // 1
    var smaller = 0 // -1
    var perfect = 0 // 0
    repeat(scanner.nextInt()) {
        when (scanner.nextInt()) {
            1 -> larger += 1
            -1 -> smaller += 1
            0 -> perfect += 1
        }
    }
    println("$perfect $larger $smaller")
}