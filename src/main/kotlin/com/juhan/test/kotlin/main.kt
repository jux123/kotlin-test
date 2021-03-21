package com.juhan.test.kotlin

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "kotlin"
    println("Hello $name")

    whenFlow(4)

    forLoop(arrayOf(10, 20, 30))

    println("Get sum1 ${getSum1(1, 2)}")
    println("Get sum2 ${getSum2(1, 2)}")
    println("Get sum3 ${getSum3(1, 2)}")
    println("Get sum defaults ${getSumDefaults(1)}")
    println("Get sum defaults ${getSumDefaults(1, 3)}")
    println("Get sum defaults2 ${getSumDefaults2(b = 2)}")

    val person = Person("Test Name")

    val genericObject = object {
        var a = 1
        val b = 2
        fun print() {
            println("a:${a} and b:${b}")
        }
    }
    println("Generic object a:${genericObject.a} and b:${genericObject.b}")
    genericObject.a = 100
    genericObject.print()

    println("TestObject last item: ${TestObject.items.last()}")

    val car = Car();
    car.start()
    println("Car has ${car.getDoors()} doors")
}

object TestObject {
    val items = arrayOf(10, 20, 30)
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
    println()
}

fun getSum1(a: Int, b: Int): Int {
    return a + b
}

fun getSum2(a: Int, b: Int): Int = a + b

// Can detect return type automatically
fun getSum3(a: Int, b: Int) = a + b
// Defaults values
fun getSumDefaults(a: Int, b: Int = 4) = a + b
// With 2 defaults params
fun getSumDefaults2(a: Int = 3, b: Int = 4) = a + b

