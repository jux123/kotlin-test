package com.juhan.test.kotlin

data class Student(val name: String, val age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Bob1", 20),
        Student("Jane2", 21),
        Student("Tom3", 20),
        Student("Mary4", 24)
    )
}