package com.dev.healthreminder

import com.dev.healthreminder.presentation.ui.utils.Platform

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()