package com.juhan.test.kotlin.spring

import com.juhan.test.kotlin.Person
import org.springframework.stereotype.Service

@Service
class PersonService {

    fun getPersons() : List<Person> {
        println("Person service: getPersons")
        return listOf(Person("Person1"), Person("Person2"))
    }
}