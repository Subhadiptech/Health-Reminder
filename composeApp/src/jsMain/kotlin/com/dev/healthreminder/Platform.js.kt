package com.dev.healthreminder

import com.dev.healthreminder.presentation.ui.utils.Platform

class JsPlatform: Platform {
    override val name: String = "Web with Kotlin/JS"
}

actual fun getPlatform(): Platform = JsPlatform()