package com.ck.kotlin_01_language
/* ======================================================== */

class InitClass(name: String) {
    init {
        println("First initializer block that prints $name")
    }

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

/* ======================================================== */

// No Primary Constructors
class Constructors {
    constructor(i: Int) {
        println("Constructor $i")
    }

    init {
        println("Init block")
    }

}
/* ======================================================== */

fun main() {
    val initObj = InitClass("Kotlin!")
    println("initObj $initObj")

    val secCon = Constructors(10)
    println("secCon $secCon")

}/* ======================================================== */
