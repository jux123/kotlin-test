package com.juhan.test.kotlin

import io.kotest.core.spec.style.BehaviorSpec

class KotestTest1 : BehaviorSpec({
    given("State A") {
        // Verify the State A exists
        println("Verify the State A exists")
        `when`("Action A") {
            // Execute Action A
            println("Execute Action A")
            then("State => A1") {
                // Verify the state is now A1
                println("Verify the state is now A1")
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
