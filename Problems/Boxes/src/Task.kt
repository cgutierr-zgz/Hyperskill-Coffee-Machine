import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val x1 = scanner.nextLong()
    val y1 = scanner.nextLong()
    val z1 = scanner.nextLong()
    val x2 = scanner.nextLong()
    val y2 = scanner.nextLong()
    val z2 = scanner.nextLong()
    val size1 = x1 * y1 * z1
    val size2 = x2 * y2 * z2
    val ref1: Long
    val ref2: Long
    val small1: Long
    val small2: Long
    val mid1: Long
    val mid2: Long


    //Getting biggest 1
    if (x1 >= y1 && x1 >= z1)
        ref1 = x1
    else if (y1 >= x1 && y1 >= z1)
        ref1 = y1
    else
        ref1 = z1
    //Getting biggest 2
    if (x2 >= y2 && x2 >= z2)
        ref2 = x2
    else if (y2 >= x2 && y2 >= z2)
        ref2 = y2
    else
        ref2 = z2
    //Getting smallest 1
    if (x1 <= y1 && x1 <= z1)
        small1 = x1
    else if (y1 <= x1 && y1 <= z1)
        small1 = y1
    else
        small1 = z1
    //Getting smallest 2
    if (x2 <= y2 && x2 <= z2)
        small2 = x2
    else if (y2 <= x2 && y2 <= z2)
        small2 = y2
    else
        small2 = z2
    //Getting mid 1
    if (x1 > y1) {
        if (y1 > z1) {
            mid1 = y1
        } else if (x1 > z1) {
            mid1 = z1
        } else {
            mid1 = x1
        }
    } else {
        if (x1 > z1) {
            mid1 = x1
        } else if (y1 > z1) {
            mid1 = z1
        } else {
            mid1 = y1
        }
    }
    //Getting mid 2
    if (x2 > y2) {
        if (y2 > z2) {
            mid2 = y2
        } else if (x2 > z2) {
            mid2 = z2
        } else {
            mid2 = x2
        }
    } else {
        if (x2 > z2) {
            mid2 = x2
        } else if (y2 > z2) {
            mid2 = z2
        } else {
            mid2 = y2
        }
    }
    //println("Box1\nSize:$size1[$small1,$mid1,$ref1]")
    // println("Box2\nSize:$size2[$small2,$mid2,$ref2]")
    //Tengo que hacer una condicion que compruebe si la caja con menor volumen se puede introducir en la caja con mayor volumen
    if ((size1 > size2 && (small2 > small1 || mid2 > mid1 || ref2 > ref1)) ||
            (size2 > size1 && (small1 > small2 || mid1 > mid2 || ref1 > ref2))
    ) {
        println("Incomparable")
    } else if (size1 == size2) {
        println("Box 1 = Box 2 ")
    } else if (size1 > size2) {
        println("Box 1 > Box 2 ")
    } else if (size2 > size1) {
        println("Box 1 < Box 2 ")
    }
}