import java.util.*

// write your code here
fun getLastDigit(a: Int): Char {
    val len = a.toString().length
    return a.toString()[len - 1]
}

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}