package com.dev.healthreminder.presentation.ui.utils

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform