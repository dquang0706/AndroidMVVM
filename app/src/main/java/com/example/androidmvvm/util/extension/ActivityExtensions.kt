package com.example.androidmvvm.util.extension

import android.app.Activity
import android.content.Context
import android.os.IBinder
import android.view.inputmethod.InputMethodManager

fun Activity.dismissKeyboard(windowToken: IBinder) {
    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
    imm?.hideSoftInputFromWindow(windowToken, 0)
}

fun Activity?.isAvailable() = this != null && !this.isFinishing

fun Activity?.available(func: () -> Unit) {
    if (isAvailable()) {
        func()
    }
}