package com.rehan.kotlin

fun main() {
    var age =20
    age=30

    val sal: Int = 40
    val sr: String="hello world"
    val dbl: Double=23.5
    val fl: Float=30.2f
    val bl:Boolean =true
    val lng :Long=1234567890
    val bt : Byte=11

    println("String = " + sr + " Double = " + dbl)
    println("\n String = $sr \n Double = $dbl \n Float = ${fl} \n Boolean = ${bl} ")
    println("\n Addition = ${ 10 + 20 } ")
    println("\n Square Root = ${ Math.sqrt(25.6) } ")
}