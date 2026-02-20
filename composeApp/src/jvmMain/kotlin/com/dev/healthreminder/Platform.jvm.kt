package com.dev.healthreminder

import com.dev.healthreminder.presentation.ui.utils.Platform

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = JVMPlatform()