package com.ck.kotlin_01_language

import android.content.Context
import android.util.AttributeSet
import android.view.View

/* ======================================================== */
/* Open - This will allow to inherit, default class is final */
open class Base(p: Int)
class Derived(p: Int) : Base(p)

/* ======================================================== */

/* If class doesn't have primary constructor,
then each secondary constructor has to initialize the base type using the 'super' */
class MyView : View {
    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}
/* ======================================================== */

/* Overriding Methods and properties */
open class Shape {
    open val vertexCount: Int = 0
    val size: Int = 0

    open fun draw() {
    }

    fun fill() {
    }
}
/* ======================================================== */

class circle() : Shape() {
    // Only open function and properties shall override here
    override fun draw() {
        super.draw()
    }

    override val vertexCount = 4
}
/* ======================================================== */
