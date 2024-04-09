package com.ck.kotlin_01_language

/* ======================================================== */

fun main() {
    simpleFun()
    funWithParams(25)
    println(funWithReturn())
    println(funSingleExp())
    funPassLambda()
    println(funLambdaExp()("Hey, I am Lambda!"))
    checkMeForHigherOrder()
    funExtension(A(10, 20))
    infixFunction()

    MemberFunction().foo()
    println("I am a sample of Generic ${Box(1).value}")

    val n = 10
    println("Factorial of $n is: ${factorial(n)}")

}
/* ======================================================== */

fun simpleFun() {
    println("This is a simple Function!")
}
/* ======================================================== */

fun funWithParams(age: Int, name: String = "Default") {
    println("This is a function with arguments as Age $age and Name $name")
}
/* ======================================================== */

fun funWithReturn(): String {
    return "This is a function with return!"
}
/* ======================================================== */

/* In Kotlin, single-expression functions are a  way to define functions that consist of just one expression*/
fun funSingleExp() = "Single Expression Function with result of ${10 + 15}"
/* ======================================================== */


/*
In Kotlin, a lambda function is a function that can be passed around as a parameter, stored in a variable, or returned from another function.
Lambdas are a concise way to define anonymous functions, especially when you need to pass functionality as an argument to higher-order functions*/
fun funLambdaExp() = { string: String -> string.uppercase() }
/* ======================================================== */

fun funPassLambda() {
    val numbers = listOf(1, -2, 4, -34, 13, -12, 56, 77, 10)
    val pos = numbers.filter { x -> x > 0 }
    val neg = numbers.filter { x -> x < 0 }
    println("We are positive! $pos")
    println("We are negative ! $neg")

    val mul = numbers.map { x -> x * 2 }
    println("Check us now, We are self promoted! $mul")
}
/* ======================================================== */

class A(val a: Int, val b: Int)

fun A.operate(): Int {
    return a + b
}
/* ======================================================== */

/* In Kotlin, extension functions allow you to add new functionality to existing classes without modifying their code*/
fun funExtension(a: A) {
    print("I am Extension Function, If don't believe check the sum of 10 + 20 = 30 in Google! :) ${a.operate()}")
}
/* ======================================================== */

/* infix function can be use without . or ()
infix it should be member or extension function
It should have only one parameters
it should be mark it with infix */
fun infixFunction() {
    val a = true
    val b = false
    val result = a or b // or is infix

    println("Result of infixFunction: $result")

    // custom infix
    val infix = 10 add 20
    println("Result of custom infix function: $infix")
}

infix fun Int.add(y: Int): Int = this + y

/* ============================================================ */
/* A member function is a function that is defined inside a class or object*/
class MemberFunction {
    fun foo() {
        println("I am member function!")
    }
}

/* ============================================================ */
/* In Kotlin, higher-order functions are functions that can take other functions as parameters or return functions.*/
fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun checkMeForHigherOrder() {
    val num1 = 10
    val num2 = 5

    // Define lambda functions for different operations
    val add: (Int, Int) -> Int = { x, y -> x + y }
    val subtract: (Int, Int) -> Int = { x, y -> x - y }
    val multiply: (Int, Int) -> Int = { x, y -> x * y }
    val divide: (Int, Int) -> Int = { x, y -> x / y }

    // Use the higher-order function to perform different operations
    println("Addition: ${applyOperation(num1, num2, add)}")
    println("Subtraction: ${applyOperation(num1, num2, subtract)}")
    println("Multiplication: ${applyOperation(num1, num2, multiply)}")
    println("Division: ${applyOperation(num1, num2, divide)}")
}

/* ============================================================ */
/* A generic function */
class Box<T>(t: T) {
    var value = t
}

/* ============================================================ */
/* A Tail recursive functions
- a style of functional programming known as tail recursion
-  tailrec - you can use a recursive function instead without the risk of stack overflow. */

fun factorial(n: Int): Long {
    // Define the tail-recursive function
    tailrec fun factorialHelper(accumulator: Long, currentNumber: Int): Long {
        // Base case: when num is 0, return the accumulated result
        if (currentNumber == 0) {
            return accumulator
        }
        // Recursive case: multiply the accumulator by num and call the function with num - 1
        return factorialHelper(accumulator * currentNumber, currentNumber - 1)
    }

    // Call the tail-recursive helper function with initial accumulator 1
    return factorialHelper(1, n)
}

/* ======================================================== */
