package com.juhan.test.kotlin

import com.juhan.test.kotlin.spring.PersonService
import com.juhan.test.kotlin.spring.SpringContext
import io.kotest.core.spec.style.BehaviorSpec
import org.springframework.test.context.ContextConfiguration

@ContextConfiguration(classes = [(SpringContext::class)])
class KotestTest1(personService: PersonService) : BehaviorSpec({
    given("State A") {
        // Verify the State A exists
        println("Verify the State A exists")
        `when`("Action A") {
            // Execute Action A
            println("Execute Action A")
            then("State => A1") {
                // Verify the state is now A1
                println("Verify the state is now A1")
                personService.getPersons()
            }
        }
    }
})


class KotestTest2 : BehaviorSpec({
    given("State A") {
        // Verify the State A exists
        println("Verify the State A exists")
        `when`("Action B") {
            // Execute Action B
            println("Execute Action B")
            then("State => B1") {
                // Verify the state is now B1
                println("Verify the state is now B1")
            }
        }
    }
})
