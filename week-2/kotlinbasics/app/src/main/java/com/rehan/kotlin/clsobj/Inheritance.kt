package com.rehan.kotlin.clsobj

open class Config(open val pool : Int) {

    //open var book : Int = 20

    init {
        println(" Pool is $pool")
    }

    open fun doConfiguration() {
        println("In side config")
        //println("pool :${pool} book : ${book}")

    }
}

class DbConfig(override val pool : Int = 20) : Config(pool) {

    //override var book =10
    override fun doConfiguration() {
        super.doConfiguration()
         println("Inside dbconfig class")
        //println("pool :${pool} book : ${book}")
    }

}

class FileConfig : Config(23) {
    override fun doConfiguration() {
        super.doConfiguration()
        println("Inside file config class")
    }

}

fun main() {
    val cfg1 = Config(56)
    cfg1.doConfiguration()

    val cfg2 = DbConfig(89)
    cfg2.doConfiguration()

    val cfg3 = FileConfig()
    cfg3.doConfiguration()

//    val cfg4 : Config = DbConfig()
//    cfg4.doConfiguration()
//
//    val cfg5 : Config = DbConfig()
//    cfg5.doConfiguration()
}
