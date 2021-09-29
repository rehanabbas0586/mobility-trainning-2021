package com.rehan.kotlin.conditional

fun main() {
    //demo1()
    
}

fun demo1() {
    println("enter your version: ")
    val os = readLine()

    if(os.equals("10")) {
        println("Oreo")
    } else if(os.equals("9")) {
        println("pie")

    } else {
        println("Android")
    }
}

fun demo2 () {
    val os = readLine()

    when(os) {
        "10 " -> println("oreo")
        "9" -> println("pie")
        "8","7" -> println("Jelly Bean")
        else -> println("Android")

    }
}

fun demo3() {
    println("enter name")
    val nm= readLine()
    val info = if(nm.equals("android")) 11 else 30
    val dt = when(nm) {
        "123"-> 123
        else -> 23

    }
    println("Info $info , dt $dt")
}

fun demo4() {
    val safeNums = intArrayOf(45,89,50)

    val num=10

    val `when` = 10
    println("When is ${`when`}")

    when(num) {
        in 1..10 -> println("It is in range")
        !in 96..100 -> println("It is not in safe range")
        in safeNums -> println("It is in safe range")
        else -> println("Invalid number")
    }
}