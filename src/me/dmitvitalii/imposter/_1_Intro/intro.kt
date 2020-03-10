package me.dmitvitalii.imposter._1_Intro

import java.util.*
import kotlin.collections.HashMap

fun main() {
    val name = "Python developers"
    print("Hello, $name")
}

fun makeHelloMessage(name: String, greeting: String = "Hello"): String {
    return "$greeting, $name!"
}

fun types() {
    val int: Int = 1

    print("")

    var longOrNot: Long?

    print("")

    val str: String

    print("")
}

fun loops() {
    for (i in 2..100) {
        println(i)
    }

    for (i in 100 downTo 1) {
        println(i)
    }

    for (i in 10 downTo 2 step 4) {
        println(i)
    }

    val arr = arrayOf("a", "c", "e")

    for (e: String in arr) {
        println(e)
    }

    arr.forEach(::println)

    val map = HashMap<Int, String>()
    map.put(1, "one")
    map.put(2, "two")
    map.put(3, "three")


    val kotlinMap = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )

    for ((key, value) in map) {
        println("{$key:$value}")
    }

    var x = 1024
    while (x > 0) {
        x--
    }

    do {
        val y = '1'
    } while (y != null)

    val myname: String
    if (Random().nextBoolean()) {
        myname = "Ha"
    } else {
        myname = "slim shady"
    }

    when (x) {
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

    class Someone(
        var name: String, // can change
        var age: Int, // time changes
        val female: Boolean // can't change
    )

    val man = Someone(
        name = "John",
        female = false,
        age = 40
    )

    val woman = Someone("Kate", 21, true)

    with(man) {
        println("He is $name, ${if (female) "woman" else "man"}, $age years old")
    }

    // has nothing to do with python's "with"! Works with any object
    with(woman) {
        age++
    }

    when {
        isTrue() -> print("inside")
    }
}

fun isTrue() = Random().nextBoolean()