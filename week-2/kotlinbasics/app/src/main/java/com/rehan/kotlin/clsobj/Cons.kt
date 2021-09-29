package com.rehan.kotlin.clsobj

class Empty1 { }
class Empty

class Cls1 constructor(nm: String)
class Cls2(nm : String)
class Cls3 constructor(nm : String) {
    val name = nm
    fun whatYourName() = name
}
class Cls4 constructor(val name : String) {
    fun whatYourName() = name
}

fun main () {
    val c1=Cls3("Android")
    println("Name is ${c1.whatYourName()}")

    val c2=Cls3("Ios")
    println("Name is ${c2.whatYourName()}")

    val c3=Cls4("Again android")
    println("Name is ${c3.whatYourName()}")
}
