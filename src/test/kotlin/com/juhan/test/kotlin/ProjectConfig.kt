package com.juhan.test.kotlin

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.extensions.spring.SpringExtension

// This activates the extension globally
class ProjectConfig : AbstractProjectConfig() {
    override fun extensions() = listOf(SpringExtension)
}