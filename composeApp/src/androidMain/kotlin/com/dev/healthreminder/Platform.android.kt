package com.dev.healthreminder

import android.os.Build
import com.dev.healthreminder.presentation.ui.utils.Platform

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()