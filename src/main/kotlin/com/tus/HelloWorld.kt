package com.tus

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//    Human().hello()
    val h = Human() //val 相當於定義常數 const , define
    h.hello()
    var age = 5
    age = age.plus(1)
    val name = "Tus"
    val enroll : Boolean = true
    println(name)

}

class Human{
    fun hello(){
        println("Hello kotlin")

    }

}