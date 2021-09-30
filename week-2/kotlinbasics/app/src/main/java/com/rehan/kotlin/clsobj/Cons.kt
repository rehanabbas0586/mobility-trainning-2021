package com.rehan.kotlin.clsobj

class Empty1 {}
class Empty

class Cls1 constructor(nm: String)
class Cls2(nm: String)
class Cls3 constructor(nm: String) {
    val name = nm
    fun whatYourName() = name
}

class Cls4 constructor(val name: String) {
    fun whatYourName() = name
}

class Cls5 {
    val dt: String

    constructor(d: String) { // secondary constructor
        dt = d
    }
}

/*
    If the class has a primary constructor, each secondary constructor needs to
    delegate to the primary constructor, either directly or indirectly through
    another secondary constructor(s). Delegation to another constructor of the
    same class is done using the this keyword
 */
class Cls6(val dt: String) { // primary
    constructor(d: String, n: Int) : this(d) {// secondary -> `this` will point to primary
        // here d is for satisfying primary constructor
        // integer n is used to perform some logic
        println("called secondary constructor 1")
    }

    constructor(d: String, n: Double) : this(d) {// secondary -> `this` will point to primary
        // here d is for satisfying primary constructor
        // double n is used to perform some logic
        println("called secondary constructor 2")
    }

    init {
        println("called init 1")
    }

    init {
        println("called init 2")
    }
}

fun main() {
    val c1 = Cls3("Android")
    println("Name is ${c1.whatYourName()}")

    val c2 = Cls3("Ios")
    println("Name is ${c2.whatYourName()}")

    val c3 = Cls4("Again android")
    println("Name is ${c3.whatYourName()}")

    val c5 = Cls6("primary") // call to primary
    val c6 = Cls6("primary", 10) // call to secondary
    val c7 = Cls6("primary", 10.6) // call to secondary
}
