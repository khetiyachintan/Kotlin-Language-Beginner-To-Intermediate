package com.ck.kotlin_01_language
/* ======================================================== */

// Type-safe at compile time , use value class (inline class)
// An inline class must have a single property initialized in the primary constructor.
// Introduces runtime overhead due to additional heap allocations and improve performance of function and higher order function

fun main() {
    iAmInlineFunction { println("I am calling inline function from main!") }
}
/* ======================================================== */
inline fun iAmInlineFunction(fn: () -> Unit) {
    fn()
    println("I am inline function! ")
}/* ======================================================== */
