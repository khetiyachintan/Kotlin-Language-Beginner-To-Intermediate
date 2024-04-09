package com.ck.kotlin_01_language

/* ======================================================== */

/* getter setter & Backing Field
* When you declare a property with a custom getter or setter, Kotlin automatically generates a backing field to store the property value.
* This backing field is accessible within the getter and setter implementations.
* */

class PropertiesClass(val width: Int, val height: Int) {
    // property type is optional since it can be inferred from the getter's return type
    val area get() = this.width * this.height

    var counter = 0 // the initializer assigns the backing field directly
        set(value) {
            if (value >= 0)
                field = value
            // counter = value // ERROR StackOverflow: Using actual name 'counter' would make setter recursive
        }
}
/* ======================================================== */

fun main() {
    val ps = PropertiesClass(200, 400)
    //  println("PropertiesClass access area using custom get ${ps.area}")
    println("PropertiesClass access area using custom get ${ps.counter}")
}

/* ======================================================== */
