import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    try {
        val (a, b) = Array<Country>(2) { Country.valueOf(input.next()) }
        println(a.hasSameCurrency(b))
    } catch (iae: IllegalArgumentException) {
        println(false)
    }
}

enum class Country(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar");

    fun hasSameCurrency(other: Country) = this.currency == other.currency
}