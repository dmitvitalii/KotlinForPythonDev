package me.dmitvitalii.imposter._4_Nullability


fun getSomeString(str: String?): String? {
    println(str!!.length)

    if (str != null) {
        str.forEach(::println)
    }

    return if (str != null) str else "23"
}