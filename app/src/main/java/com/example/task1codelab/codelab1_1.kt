package com.example.task1codelab

fun main(){
    // Printing a message
    println("Hello, World!")

    // Adding two integers
    val num1 = 10
    val num2 = 20
    val sum = num1 + num2
    println("Sum of $num1 and $num2 is $sum")

    // Multiplying two floating-point numbers
    val float1 = 3.14
    val float2 = 2.0
    val product = float1 * float2
    println("Product of $float1 and $float2 is $product")

    //Type casts enable you to convert objects to a different type.
    val obj: Any = "Hello"
    val str: String? = obj as? String
    val num: Int? = obj as? Int
    println("str: $str") // Output: str: Hello
    println("num: $num") // Output: num: null

// 	val and var Variables
    val name: String = "Baeldung" // Immutable
    var age: Int = 30 // Mutable
    age += 5 // Reassigned
    println("Name: $name, Age: $age")

//  Nullable Variables
    val nullableString: String? = "Hello"
    val nullableInt: Int? = null
    println("String: $nullableString, Int: $nullableInt")

//  Looping Through an Array with Index and Elements
    val languages = arrayOf("Ruby", "Kotlin", "Python", "Java")
    for ((index, language) in languages.withIndex()) {
        println("Index: $index, Language: $language")
    }

    // thanks






}