package com.juhan.test.kotlin

fun main(args: Array<String>) {
    var name = if (args.size > 0) args[0] else "kotlin"
    println("Hello $name")
}