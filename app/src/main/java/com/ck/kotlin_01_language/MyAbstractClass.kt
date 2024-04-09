package com.ck.kotlin_01_language
/* ======================================================== */


/* In Kotlin, an abstract class is a class that cannot be instantiated directly.
It serves as a blueprint for other classes to inherit from and provides common functionality that subclasses can override or implement.*/
abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}
/* ======================================================== */

fun main() {
    val myObj = object : MyAbstractClass() {
        override fun doSomething() {
            println("Hey, Let's do something!")
        }

        override fun sleep() {
            println("No, Please don't sleep!")

        }
    }
    myObj.doSomething()
}
/* ======================================================== */
