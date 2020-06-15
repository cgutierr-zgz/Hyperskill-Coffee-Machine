package machine

import java.lang.Exception

//Starting Resources
var water = 400
var milk = 540
var coffeeBeans = 120
var dispensableCups = 9
var money = 550

fun main() {
    var exit = false
    while (!exit) {
        print("Write action (buy, fill, take, remaining, exit): > ")
        when (readLine()) {
            "remaining" -> { // information about current resources
                actualResources()
            }
            "buy" -> { // we take resources and add money, if possible
                print("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > ")
                when (readLine()) {
                    "1" -> { // espresso
                        if (water - 250 >= 0 && coffeeBeans - 16 >= 0 && dispensableCups - 1 >= 0) {
                            println("I have enough resources, making you a coffee!\n")
                            resourcesCoffee(-250, 0, -16, 4, -1)
                        } else {
                            checkNeeds(250, 0, 16, 1)
                        }
                    }
                    "2" -> { // latte
                        if (water - 350 >= 0 && milk - 75 >= 0 && coffeeBeans - 20 >= 0 && dispensableCups - 1 >= 0) {
                            println("I have enough resources, making you a coffee!\n")
                            resourcesCoffee(-350, -75, -20, 7, -1)
                        } else {
                            checkNeeds(350, 75, 20, 1)
                        }
                    }
                    "3" -> { // capuccino
                        if (water - 200 >= 0 && milk - 100 >= 0 && coffeeBeans - 12 >= 0 && dispensableCups - 1 >= 0) {
                            println("I have enough resources, making you a coffee!\n")
                            resourcesCoffee(-200, -100, -12, 6, -1)
                        } else {
                            checkNeeds(200, 100, 12, 1)
                        }
                    }
                    "back"->{
                        exit = false
                    }
                    else -> {
                        errorFound("Not an option")
                    }
                }
            }
            "fill" -> { // we add resources
                print("\nWrite how many ml of water do you want to add: > ")
                try {
                    resourcesCoffee(readLine()!!.toInt(), 0, 0, 0, 0)
                } catch (ex: Exception) {
                    errorFound(ex.toString())
                }
                print("Write how many ml of milk do you want to add: > ")
                try {
                    resourcesCoffee(0, readLine()!!.toInt(), 0, 0, 0)
                } catch (ex: Exception) {
                    errorFound(ex.toString())
                }
                print("Write how many grams of coffee beans do you want to add: > ")
                try {
                    resourcesCoffee(0, 0, readLine()!!.toInt(), 0, 0)
                } catch (ex: Exception) {
                    errorFound(ex.toString())
                }
                print("Write how many disposable cups of coffee do you want to add: > ")
                try {
                    resourcesCoffee(0, 0, 0, 0, readLine()!!.toInt())
                } catch (ex: Exception) {
                    errorFound(ex.toString())
                }
                print("\n")
            }
            "take" -> { // we take all the mony
                println("\nI gave you $$money\n")
                resourcesCoffee(0, 0, 0, -money, 0)
            }
            "exit" -> {
                exit = true
            }
            else -> {
                errorFound("Not an option")
            }
        }
    }
}

fun resourcesCoffee(waterNeeded: Int, milkNeeded: Int, coffeeBeansNeeded: Int, moneyNeeded: Int, dipsCupsNeeded: Int) {
    water += waterNeeded
    milk += milkNeeded
    coffeeBeans += coffeeBeansNeeded
    money += moneyNeeded
    dispensableCups += dipsCupsNeeded
}

fun actualResources() {
    println("\nThe coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$coffeeBeans of coffee beans")
    println("$dispensableCups of disposable cups")
    if (money == 0) {
        println("$money of money\n")

    } else {
        println("$$money of money\n")
    }
}

fun checkNeeds(waterNeeded: Int, milkNeeded: Int, coffeeBeansNeeded: Int, dipsCupsNeeded: Int) {
    if (water - waterNeeded < 0) {
        println("Sorry not enough water\n")
    }
    if (milk - milkNeeded < 0) {
        println("Sorry not enough milk\n")
    }
    if (coffeeBeans - coffeeBeansNeeded < 0) {
        println("Sorry not enough coffee beans\n")
    }
    if (dispensableCups - dipsCupsNeeded < 0) {
        println("Sorry not enough dispensable cups\n")
    }
}

fun errorFound(ex: String) {
    println("\nError($ex)\n")
}
