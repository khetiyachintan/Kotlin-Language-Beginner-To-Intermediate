package com.ck.kotlin_01_language

/* ======================================================== */

fun main() {
    useIf()
    useWhen("Kotlin")
    forLoop()
    whileLoop()
    doWhileLoop()
    useRange()
}

/* ======================================================== */
fun useIf() {
    val d: Int
    val check = true
    if (check) {
        d = 1
    } else {
        d = 2
    }
    println(d)

    // OR
    println(if (check) 1 else 2)
}

/* ======================================================== */
fun useWhen(desc: Any): Any =
    when (desc) {
        1 -> "One"
        "Kotlin" -> "Hey, Folks"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "unknown"
    }
/* ======================================================== */
fun forLoop() {
    val languages = listOf("Java", "Kotlin", "Dart")
    for (index in languages.indices) {
        println("languages @ $index is ${languages[index]}")
    }
}
/* ======================================================== */
fun whileLoop() {
    val languages = listOf("Java", "Kotlin", "Dart")
    var index = 0;
    while (index < languages.size) {
        println("languages @ $index is ${languages[index]}")
        index++
    }
}
/* ======================================================== */
fun doWhileLoop() {
    val languages = listOf("Java", "Kotlin", "Dart")
    var index = 0;
    do {
        println("languages @ $index is ${languages[index]}")
        index++
    } while (index < languages.size)
}
/* ======================================================== */
fun useRange() {
    val y = 20
    val x = 10
    if (x in 1..y) {
        println("In range")
    } else {
        println("out of range")
    }

    for (i in 1..10) {
        println("Range 1 to 10:  $i")
    }

    for (i in 1..<10) {
        println("Range 1 to 9:  $i")
    }

    for (i in 2..10 step 2) {
        println("Range 2 to 10 with gap of 2: $i")
    }
    for (i in 10 downTo 9) {
        println("Range from 10 to 1 downTo: $i")

    }
    for (i in 'a'..'d') {
        println("Range from a to d : $i")

    }

}
/* ======================================================== */
