package com.juhan.test.kotlin

class Car : Vehicle {
    override val name = "Ford"

    override fun getDoors(): Int {
        return 5
    }
}