package com.juhan.test.kotlin

interface Vehicle {
    val name: String
    fun start() {
        println("Started vehicle")
    }
    fun getDoors(): Int
}