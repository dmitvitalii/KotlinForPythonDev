package me.dmitvitalii.imposter._2_Entity

import kotlin.reflect.KProperty

class MyAwesomeDelegate(var field: String) {
    operator fun getValue(thisRef: Any?, p: KProperty<*>): String {
        println("Loading value.....")
        return field
    }

    operator fun getValue(thisRef: Any?, p: KProperty<*>, v: String) {
        println("Setting value.....")
        field = v
    }
}