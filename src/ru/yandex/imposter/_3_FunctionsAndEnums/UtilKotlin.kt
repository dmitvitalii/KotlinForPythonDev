package ru.yandex.imposter._3_FunctionsAndEnums


infix fun String.toCase(aCase: Case) = when (aCase) {
    Case.NOMINATIVE -> this
    Case.GENITIVE -> "${this}а"
    Case.DATIVE -> "${this}у"
}

fun main() {
    "Вторник" toCase Case.DATIVE
}
