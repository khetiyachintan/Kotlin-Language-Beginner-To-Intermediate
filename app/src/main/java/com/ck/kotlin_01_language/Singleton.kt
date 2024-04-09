package com.ck.kotlin_01_language

class Singleton private constructor() {
    companion object {

        //annotation is needed to ensure that the instance property is updated atomically
        @Volatile
        private var instance: Singleton? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: Singleton().also { instance = it }
            }
    }

    fun doSomething() = "Dude, I am calling with the help of Singleton object!"
}

fun main() {
    val instance = Singleton.getInstance()
    println(instance.doSomething()) // Calling this function as Singleton
}