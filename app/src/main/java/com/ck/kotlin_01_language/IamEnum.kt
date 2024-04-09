package com.ck.kotlin_01_language

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

/* ======================================================== */

fun main() {
    println("Enum with Interface PLUS : ${IntArithmetics.PLUS.applyAsInt(10, 20)}")
    println("Enum with Interface TIMES : ${IntArithmetics.TIMES.applyAsInt(10, 20)}")
}

/* ============================================================ */
// Each enum constant is an object
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

/* ============================================================ */
// Anonymous classes
// Enum constants can declare their own anonymous classes with their corresponding methods
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

/* ============================================================ */
// Implementing interfaces in enum classes
enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };

    override fun applyAsInt(t: Int, u: Int) = apply(t, u)
}
