package com.ck.kotlin_01_language

/* ======================================================== */
fun main() {
    val obj = IamClass("Kotlin")
    println("I(${obj.str}) am the King of the Language! :) ")
    obj.iAmMemberFunction()

    // compare Instance
    val langJava = IamDataClass("Java", 1)
    val langKotlin = IamDataClass("Kotlin", 2)
    val langDart1 = IamDataClass("Dart", 3)
    val langDart2 = IamDataClass("Dart", 3)

    println("langJava == langKotlin: ${langJava == langKotlin}")
    println("langKotlin == langDart1: ${langKotlin == langDart1}")
    println("langDart1 == langDart2: ${langDart1 == langDart2}")

    // Copy object
    println("Copy exactly of langJava ${langJava.copy()}")
    println("Copy with name ${langJava.copy("PHP")}")
    println("Copy with ID ${langJava.copy(id = 4)}")

    // sealed class
    // Objects of different subclasses created
    val app = Fruit.Apple()
    val ban = Fruit.Banana()
    val pom = Pomegranate()

    // Function called with different objects
    display(app)
    display(ban)
    display(pom)
}
/* A simple class with keyword 'class'
You can declare properties without val or var within parentheses but
these properties are not accessible after an instance has been created */

/* ============================================ */
class IamClass(val str: String = "Kotlin") {
    fun iAmMemberFunction() {
        println("I am Member function, i.e. A function which must be part of class body and accessible by class object. ")
    }
}

/* ============================================ */
/* data classes : which are particularly useful for storing data */
data class IamDataClass(val language: String = "default", val id: Int = 0)

/* ============================================ */
/* Sealed classes : No other subclasses may appear outside the module and package.
 Their constructors are protected by default.
 A sealed class is implicitly abstract and hence it cannot be instantiated. */


// A sealed class with a string property
sealed class Fruit(val str: String) {

    // Two subclasses of sealed class defined within
    class Apple : Fruit("Apple")
    class Banana : Fruit("Banana")
}

// A subclass defined outside the sealed class
class Pomegranate : Fruit("Pomegranate")

fun display(frt: Fruit) {
    when (frt) {
        is Fruit.Apple -> println("${frt.str} is good for iron")
        is Fruit.Banana -> println("${frt.str} is delicious")
        is Pomegranate -> println("${frt.str} is good for vitamin D")
    }
}

// Good example as Payment
sealed class Payment {
    data class CreditCard(val number: String, val expiryDate: String) : Payment()
    data class PayPal(val email: String) : Payment()
    data object Cash : Payment()
}

fun processPayment(payment: Payment) {
//    when (payment) {
//        is Payment.CreditCard -> processCreditCardPayment(payment.number, payment.expiryDate)
//        is Payment.PayPal -> processPayPalPayment(payment.email)
//        is Payment.Cash -> processCashPayment()
//    }
}
/* ============================================ */
