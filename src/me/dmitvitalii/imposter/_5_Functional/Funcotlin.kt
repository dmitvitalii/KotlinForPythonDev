package me.dmitvitalii.imposter._5_Functional

fun main() {
    val list = proceduralStyle()

    println(list)

    repeat {
        println("Hey")
    }

    repeat(4) {
        println("Hey")
    }
}

fun proceduralStyle(): List<String> {
    val numbers = (1..100).toList()
    val result = mutableListOf<String>()
    for (i in numbers) {
        if (i % 16 == 0) {
            result.add("0x$i")
        }
    }
    return result
}

fun functionalStyle(): List<String> {
    return (1..100)
        .filter { it % 16 == 0 }
        .also { println("Debug message") }
        .map { "0x$it" }
}

fun functionalStyleSequence(): List<String> {
    return (1..100)
        .asSequence()
        .filter { it % 16 == 0 }
        .also { println("Debug message") }
        .map { "0x$it" }
        .toList()
}

fun repeat(times: Int = 2, lambda: (Int) -> Unit) {
    for (i in 0..times) { // until finished
        lambda(i)
    }
}
