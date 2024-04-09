package com.ck.kotlin_01_language/* ======================================================== */

fun main() {
    // neverNull has String type, Default null aren't accept
    var neverNull: String = "This can't be null"

    // Throws a compiler error
    //  neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"

    // This will accept as null
    nullable = null

    println(strLength(neverNull)) // Length: 18
    //   println(strLength(nullable))  // Throws a compiler error

    var nullString: String? = null
    println(safeCall(nullString))

    println(elvisCall(nullString))
}

/* ======================================================== */

// notNull doesn't accept null values
fun strLength(notNull: String): Int {
    return notNull.length
}/* ======================================================== */

fun safeCall(maybeString: String?): Int? =
    maybeString?.length // safe call by ?./* ======================================================== */

fun elvisCall(maybeString: String?): Int =
    maybeString?.length ?: 0 // Elvis ?: provide a default value if value is null
