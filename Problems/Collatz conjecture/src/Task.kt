import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    //Si n es par -> n/2
    //Si n es impar -> (n*3)+1
    var n = scanner.nextInt()
    while (n != 1) {
        print("$n ")
        if (n % 2 == 0)
            n /= 2
        else
            n = (n * 3) + 1
    }
    print("$n")
}