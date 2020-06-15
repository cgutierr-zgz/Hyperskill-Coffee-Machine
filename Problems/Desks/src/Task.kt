import java.util.Scanner
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    // put your code here
    var class1 = scanner.nextFloat()
    var class2 = scanner.nextFloat()
    var class3 = scanner.nextFloat()
    var class11: Int? = null
    var class22: Int? = null
    var class33: Int? = null


    if (class1.toInt() % 2 == 0) {
        class11 = class1.toInt()
    } else {
        class11 = class1.toInt()
        class11 += 1
    }
    if (class2.toInt() % 2 == 0) {
        class22 = class2.toInt()

    } else {
        class22 = class2.toInt()
        class22 += 1
    }
    if (class3.toInt() % 2 == 0) {
        class33 = class3.toInt()

    } else {
        class33 = class3.toInt()
        class33 += 1
    }

    val result = (class11 / 2) + (class22 / 2) + (class33 / 2)
    println(result)

}