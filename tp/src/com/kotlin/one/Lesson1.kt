package com.android.one

fun main() {

    println("👋 Welcome to the Kotlin Playground!")
    println("Let's start learning step by step.\n")


    // ✅ EXERCISE 1 Variables:
    // Create two variables: `city` (String) and `temperature` (Double)
    // Then print: "It is {temperature}°C in {city}"
    // Enforce `city` to be immutable and `temperature` mutable
    // Then print the sentence again after changing `temperature`

    TODO(
        "Exercise 1 Variables implementation"
        val city = "Port-au-Prince"
        var temperature = 10
        println("It is ${temperature}°C in ${city}")
        temperature = 20
        println("It is ${temperature}°C in ${city}")
    )


    // ✅ EXERCISE 2 Conditionals:
    // Create a variable `score` (Int)
    // Handle the following cases:
    // - If score is exactly 100, print "Perfect score!"
    // - If score is below 0 or above 100, print "Invalid score"
    // - If score between 0 and 49, print "You failed!"
    // - If score between 50 and 60, print "Just passed!"
    // - If score between 61 and 99, print "Well done!"

    TODO(
        "Exercise 2 Conditionals implementation"
        var score =90
    when  {
        score == 100 -> println("Perfect score!")
        score < 0 ||  score > 100 -> println("Invalid score")
        score in 0..49 -> println("You failed!")
        score in 50..60 -> println("Just passed!")
        else -> println("Well done!")
    }
    )

    // ✅ EXERCISE 3 list and Loops:
    // Create a list of your favorite fruits
    // Loop through the list and print each fruit in uppercase
    // Then, print the total number of fruits in the list
    // Ask the user to enter a fruit name and check if it's in the list

    TODO(
        "Exercise 3 List and Loops implementation"
        var favorite_fruits  = listOf("Mango", "Blueberry", "Pineapple")
    println("List of fruits in Uppercase:")
    for (favorite_fruit in favorite_fruits) {
        println(favorite_fruit.uppercase())
    }
    println("\nTotal number of fruits: ${favorite_fruits.size}")
    println("\nenter a fruit name: ")
    val fruit = readln()
//println(fruit)
    if (fruit in favorite_fruits) {
        println("Your fruit has been in the List!")
    }
    else{
        println("Your fruit has not been in the List!")
    }
    )

    // ✅EXERCISE 4 Elvis Operator:
    // Create a nullable variable `nickname` of type String? and assign it null
    // Print the number of characters in `nickname`
    // Print the nickname or "No nickname provided" if it's null using the Elvis operator

    TODO(
        "Exercise 4 Elvis Operator implementation"
        var nickname : String?= null
    println(nickname?.length)
    val displayName = nickname ?: "No nickname provided"
    println("Status: $displayName")
    nickname = "KotlinCoder"
    )

}

