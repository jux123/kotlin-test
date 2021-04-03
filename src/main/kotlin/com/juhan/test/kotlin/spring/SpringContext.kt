package com.juhan.test.kotlin.spring

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan("com.juhan.test.kotlin")
open class SpringContext {
}