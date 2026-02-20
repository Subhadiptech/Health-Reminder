package com.dev.healthreminder.presentation.ui

import com.dev.healthreminder.presentation.ui.utils.getPlatform

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}