package com.ck.kotlin_01_language

/* ======================================================== */

fun main() {
    loadList()
    loadSet()
    loadMap()
}

/* ======================================================== */
/* Lists store items in the order that they are added, and allow for duplicate items.*/
fun loadList() {

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)


    println("The first item in the list is: ${readOnlyShapes[0]}")
    println("The first item in the list is : ${readOnlyShapes.first()}")
    println("The last item in the list is : ${readOnlyShapes.last()}")
    println("The size of list : ${readOnlyShapes.count()}")
    println("Does circle exist in list? : ${"circle" in readOnlyShapes}")
    println("I am adding Hexagon into shapes list ${shapes.add("Hexagon")}")
    println("I am removing square from shapes list ${shapes.remove("square")}")
    println("Check final list:  $shapes")
}

/* ======================================================== */
/* sets are unordered and only store unique items. */
fun loadSet() {

    val readOnlyFruit = setOf("banana", "apple", "cherry", "cherry")

    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("banana", "apple", "cherry", "cherry")

    println(readOnlyFruit)
    println(fruit)
}

/* ======================================================== */
/* Maps store items as key-value pairs, Key must be unique, value can be a duplicate */
fun loadMap() {

    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> =
        mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)

    println("We have total ${juiceMenu.count()} fruits in our menu!")
    println("The price of apple juice is: ${juiceMenu["apple"]}")

    println("We have recently added the : ${juiceMenu.put("coconut", 150)}")
    println("Also we removed orange : ${juiceMenu.remove("orange")}")
    println("Do you have grapes? : ${juiceMenu.containsKey("grapes")}")

    println("Check-out our revised menu : $juiceMenu")

    // Traverse a map
    for ((k, v) in juiceMenu) {
        println("$k -> $v")
    }
}
/* ======================================================== */
