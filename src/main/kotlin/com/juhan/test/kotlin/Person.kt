package com.juhan.test.kotlin

class Person(val name: String) {
    init {
        println("Constructing Person with name $name")
    }

    operator fun component1(): String = name
}
