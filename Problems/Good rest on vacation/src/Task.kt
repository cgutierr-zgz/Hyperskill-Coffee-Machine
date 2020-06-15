import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val duration = scanner.nextInt()
    val foodPerDay = scanner.nextInt()
    val oneFlight = scanner.nextInt()
    val nightsCost = scanner.nextInt() //Nights = nightsCost*(duration - 1)

    println((foodPerDay * duration) + (oneFlight * 2) + (nightsCost * (duration - 1)))
}