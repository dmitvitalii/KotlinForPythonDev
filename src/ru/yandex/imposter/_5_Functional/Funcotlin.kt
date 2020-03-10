package ru.yandex.imposter._5_Functional

import ru.yandex.imposter._3_FunctionsAndEnums.Case
import ru.yandex.imposter._3_FunctionsAndEnums.toCase

fun main() {
    val list = proceduralStyle()


    repeat(6) {
        say {
            "Вторник" toCase Case.DATIVE
        }
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



infix fun String.repeat(times: Int = 2
}
