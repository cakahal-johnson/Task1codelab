package com.example.task1codelab

// Define a function with no return type
fun greeting() {
    println("Hello, Kotlin!!!")
}


// Main function with command line arguments
fun main(args: Array<String>) {
    // Call the greeting function
    greeting()

    // Demonstrate the use of command line arguments
    if (args.isNotEmpty()) {
        println("Command line argument received: ${args[0]}")
    } else {
        println("No command line arguments provided.")
    }

    // Demonstrate the use of a filter with a lambda expression
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val filteredDecorations = decorations.filter { it.startsWith('p') }
    println("Decorations starting with 'p': $filteredDecorations")

    // Demonstrate the use of a compact function
    val temperature = 10
    println("Is the temperature too hot? ${isTooHot(temperature)}")
} // end of main

// Compact function to check if the temperature is too hot
fun isTooHot(temperature: Int) = temperature > 30

