package com.rehan.kotlin.basic

fun simple(): Int {
    return 10
}

fun addition (num1:Int,num2:Int):Int {
    return num1+num2
}

fun rttp (): Unit {
    println("Just call")
}
fun nTimes( num : Int, n : Int ) = n * num // inline function
fun defaultValues( // indentation would be like this
    num1 : Int = 30, // default value
    num2 : Int = 20 //  default value
) : String {
//    println(" Num1  $num1 Num2 $num2")

    return "Num1 = ${num1}, Num2 = ${num2}"
}


fun main() {
    val dt = simple()
    println("Dt is $dt")
    println("Addition is ${addition(12, 3)}")
    rttp()

    println("10 3 Times is ${nTimes(10, 3)}")

    println("defaultValues() ${defaultValues()}")
    println("defaultValues(89, 56) ${defaultValues(89, 56)}")
    println("defaultValues(num2 = 4555, num1 = 10) ${defaultValues(num2 = 4555, num1 = 10)}") // named parameters
    println("defaultValues(num2 = 878) ${defaultValues(num2 = 878)}")
}