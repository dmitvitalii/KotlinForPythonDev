package me.dmitvitalii.imposter._2_Entity

class NameKotlin {
    var title = "Mr"
        set(title) {
            println("setTitle says: $title")
            field = title
        }

    var name = "John"
        set(value: String) {
            println("setName says: $value")
            field = value
        }
        get() = this.title + " " + field

    val age by lazy {
        println("How old are you?")
        readAge()
    }
}

fun readAge() = 42