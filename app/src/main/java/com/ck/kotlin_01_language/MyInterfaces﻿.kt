package com.ck.kotlin_01_language

/* ======================================================== */

fun main() {
    val obj = Child()
    obj.name()
    obj.age()

    // Interfaces Inheritance
    val imp = IamPerson("Hello ", "World!")
    println("FullName using Interfaces Inheritance: ${imp.name}")

    // SAM
    println("isEvenWithOutSAM ${isEvenWithOutSAM.accept(10)}")
    println("isEvenWithSAM ${isEvenWithSAM.accept(20)}")
}

/* ========================================================= */
/* Simple Interface */
interface MyInterfaces {
    fun name()
    fun age() {
        println("I am part of MyInterfaces")
    }

    val id: Int // abstract
}

class Child() : MyInterfaces {
    override val id: Int = 29
    override fun name() {
        println("I(name) am part of Child Class")
    }

    override fun age() {
        //super.age()
        println("Now, I(age) am part of Child Class, BTW you can over super.age also!")
    }
}

/* ========================================================= */
/* Interfaces Inheritance */
interface FullName {
    val name: String
}

interface Person : FullName {
    val fname: String
    val lname: String

    override val name: String
        get() = fname + lname
}

class IamPerson(override val fname: String, override val lname: String) : Person

/* ========================================================= */
/* Functional (SAM) interfaces :
- interface with only ONE abstract method is called a functional interface,
or a Single Abstract Method (SAM) interface*/

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

// Creating an instance of a class
val isEvenWithOutSAM = object : IntPredicate {
    override fun accept(i: Int): Boolean {
        return i % 2 == 0
    }
}

// Creating an instance using lambda
val isEvenWithSAM = IntPredicate { it % 2 == 0 }

/* ========================================================= */
