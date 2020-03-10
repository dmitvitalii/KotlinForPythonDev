package ru.yandex.imposter._1_Intro

import ru.yandex.imposter._2_Entity.WallpaperKotlin
import java.util.*

fun main() {
    val name = "Python developers"

    makeHelloMessage()
    print("Hello, $name")
}

fun makeHelloMessage(VASYA: () -> String): String {
    lambda()
}

fun types() {
    val int = 1

    print("")

    var longOrNot: Long? = System.currentTimeMillis()

    print(longOrNot)

    val str: String? = "hello"

    print(str?.forEach { })
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
    arr.forEach(::println)

    val map = hashMapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )

    for ((key, value) in map) {
        println("{${key.dec()}:$value}")
    }


    var x = 1024
    while (x > 0) {
        x--
    }

    do {
        val y = '1'
    } while (y != null)


    val myname = if (Random().nextBoolean()) {
        "Ha"
    } else {
        "slim shady"
    }


    val str = when (x) {
        is Int -> "adfasdf"
        in 1..10 -> "x is in the range"
        !in 10..20 -> "x is outside the range"
        else -> "none of the above"
    }

    when {
        isTrue() -> print("inside")
    }

    val l: Long? = System.currentTimeMillis()
}


