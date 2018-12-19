package com.tus

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//    Human().hello()
    val h = Human() //val 相當於定義常數 const , define
    h.hello()
}

class Human{
    fun hello(){
        println("Hello kotlin")

    }

}