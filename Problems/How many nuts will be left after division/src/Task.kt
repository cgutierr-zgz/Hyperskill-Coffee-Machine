import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    var Nsquirrels: Int = scanner.nextInt()
    var Knuts: Int = scanner.nextInt()

    println(Knuts % Nsquirrels)
}