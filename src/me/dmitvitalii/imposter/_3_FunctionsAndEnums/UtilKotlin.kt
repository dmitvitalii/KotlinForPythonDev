package me.dmitvitalii.imposter._3_FunctionsAndEnums

import me.dmitvitalii.imposter._3_FunctionsAndEnums.Case.*

object UtilJavaStyle {

    @Throws(UnsupportedCaseException::class)
    fun getMonday(aCase: Case): String {
        when (aCase) {
            NOMINATIVE -> return "Понедельник"
            GENITIVE -> return "Понедельника"
            DATIVE -> return "Понедельнику"
            else -> throw UnsupportedCaseException("Не знаю что ты хочешь")
        }
    }
}


// Kotlin style
fun getMonday(aCase: Case) = when (aCase) {
    NOMINATIVE -> "Понедельник"
    GENITIVE -> "Понедельника"
    DATIVE -> "Понедельнику"
}


// Extension function
fun String.toCase(aCase: Case) = when (aCase) {
    NOMINATIVE -> this
    GENITIVE -> "${this}а"
    DATIVE -> "${this}у"
}

// Extension function
infix fun String.make(aCase: Case) = when (aCase) {
    NOMINATIVE -> this
    GENITIVE -> "${this}а"
    DATIVE -> "${this}у"
}


fun main() {
    println(getMonday(GENITIVE))

    println("Вторник".toCase(GENITIVE))

    println("Вторник" make DATIVE)
}
