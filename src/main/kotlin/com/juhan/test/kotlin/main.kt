package com.juhan.test.kotlin

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "kotlin"
    println("Hello $name")

    whenFlow(4)

    forLoop(arrayOf(10, 20, 30))
}


fun whenFlow(number: Int) {
    when(number) {
        1 -> println("One")
        2,3 -> println("2 or 3")
        in 4..10 -> println("range between 4 and 10")
        else -> {
            println("More than 10")
        }
    }

    when {
        number % 2 == 0 -> println("Even number")
        number % 2 == 1 -> println("Odd number")
    }
}

fun forLoop(myArray: Array<Int>) {
    for (item in 1..5) {
        print("$item, ")
    }

    println()
    for ((index, ch) in "test".withIndex()) {
        print("${index + 1}) $ch, ")
    }
    println()

    for (item in myArray.indices) {
        print("Arr[$item]: ${myArray[item]}, ")
    }
    println()
    for (item in myArray) {
        print("$item, ")
    }
    println()
    for ((index, item) in myArray.withIndex()) {
        print("Arr[$index]: $item, ")
    }
}

