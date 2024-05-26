package com.example.task1codelab

class Aquarium(val length: Int, val width: Int, val height: Int) {
    // Method to calculate the volume of water in the aquarium
    fun volume(): Int {
        return length * width * height
    }
}

fun main() {
    // Create an instance of the Aquarium class
    val myAquarium = Aquarium(length = 10, width = 5, height = 8)

    // Access the properties and call the method
    println("Aquarium dimensions: ${myAquarium.length} x ${myAquarium.width} x ${myAquarium.height}")
    println("Volume of water in the aquarium: ${myAquarium.volume()} cubic units")
}
