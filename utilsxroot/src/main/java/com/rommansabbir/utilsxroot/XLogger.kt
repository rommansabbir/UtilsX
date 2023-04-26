package com.rommansabbir.utilsxroot

import android.util.Log

object XLogger {
    private const val TAG = "UtilsX"

    fun debug(message: String) {
        Log.d(TAG, message)
    }

    fun debug(exception: Exception) {
        Log.d(TAG, exception.stackTraceToString())
    }
}