package com.ck.kotlin_01_language
/* ======================================================== */

fun main() {
    println("Calling Nested class fun ${NestedClass.Nested().foo()}")
    println("Calling inner class fun ${Outer().Inner().foo()}")
}

/* ============================================================ */
// Nested classes
class NestedClass {
    private val bar: Int = 1

    class Nested {
        fun foo() = 2

    }
}

/* ============================================================ */

// Inner classes - A nested class marked as inner can access the members of its outer class.
class Outer {
    private val bar: Int = 1

    inner class Inner {
        fun foo() = bar
    }
}


/* ======================================================== */
