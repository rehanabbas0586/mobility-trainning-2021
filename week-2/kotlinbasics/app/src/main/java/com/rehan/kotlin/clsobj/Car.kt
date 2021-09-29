package com.rehan.kotlin.clsobj

class Car {
    var speed = 10

    fun speedUp() = speed++

    fun putNthGear(n:Int) {
        println("speed is ${speedUp() * n}")
    }
}
fun main() {
    val c = Car() // object of the car
    c.speedUp() // method call on object
    c.putNthGear(2) // method call on object
}