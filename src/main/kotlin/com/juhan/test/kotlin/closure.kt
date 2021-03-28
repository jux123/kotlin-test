package com.juhan.test.kotlin

fun closureMaker() : () -> Unit {
    var num = 0
    return { println(num++) }
}