package com.ck.kotlin_01_language // Import the package that help to access the class, function, Interface, etc..

/* ======================================================== */

/* Entry point function */
fun main() {

    println("Hello, world!")

    firstFunction()

    // Visibility
    visibilityPublic()
    visibilityPublicDefine()
    visibilityPrivate()
    visibilityInternal()
    visibilityProtected()
}
/* ======================================================== */

fun firstFunction() {
    val code = 91    // Val - Read-only (Immutable)
    var mobile: Long // Var - mutable
    mobile = 7878060124

    /* String templates
    place the code within curly braces {} after the dollar sign $. */

    println("Mobile No: +$code-$mobile")
    println("Mobile No: +${code + 1} $mobile")

    types()
}

/* ======================================================== */
/* Data Types */
fun types() {

    // https://kotlinlang.org/docs/numbers.html

    /* Integers */

    var byte: Byte = 1
    var short: Short = 1
    var int: Int = 2
    var long: Long = 7878060124

    /* Floating-point numbers */
    var float: Float = 25.24F
    var double: Double = 45.7182818284

    /* Booleans */
    var isUser: Boolean = true

    /* Characters */
    var char: Char = 'a'

    /* Strings */
    var kotlin: String = "Kotlin"
}

/* ======================================================== */
/* Visibility Modifiers: In Kotlin control the visibility of classes, interfaces, functions, properties, and other declarations within your codebase.
* There are four visibility modifiers:
* Public: This is the default visibility modifier in Kotlin. It means that the declaration is accessible from any other code in the same module or project.
* Private: When a declaration is marked as private, it's visible only within the file it's declared in. This means that other files in the same module cannot access it.
* Protected: Declarations marked as protected are visible in subclasses but not in other parts of the same module. It's similar to private but with the additional visibility in subclasses.
* Internal: This visibility modifier makes the declaration visible within the same module. It's like public but limited to the current module, making it useful for creating APIs that are internal to a module but not exposed outside of it.
*/
fun visibilityPublic() {
    println("Function visibility: Public as default, i.e accessible everywhere")
}

public fun visibilityPublicDefine() {
    println("Function visibility: Public as defined, i.e accessible everywhere")
}

private fun visibilityPrivate() {
    println("Function visibility: Private, i.e accessible within file")
}

internal fun visibilityInternal() {
    println("Function visibility: internal, i.e accessible everywhere in same module")
}

fun visibilityProtected() {
    println("Function visibility: protected , i.e accessible same as private but also visible for sub class, and can't define at top-level.")
}
/* ======================================================== */


