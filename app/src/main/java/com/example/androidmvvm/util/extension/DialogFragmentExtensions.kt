package com.example.androidmvvm.util.extension

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager

fun DialogFragment.showIfNotExist(fragmentManager: FragmentManager, tag: String?) {
    val isNotExist = fragmentManager.findFragmentByTag(tag) == null
    if (isNotExist) {
        showNow(fragmentManager, tag)
    }
}

fun DialogFragment.dismissIfAdded() {
    if (isAdded) dismiss()
}