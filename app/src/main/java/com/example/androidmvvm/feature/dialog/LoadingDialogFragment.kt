package com.example.androidmvvm.feature.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.androidmvvm.R
import com.example.androidmvvm.platform.BaseFullScreenDialogFragment
import com.example.androidmvvm.databinding.DialogLoadingBinding

class LoadingDialogFragment : BaseFullScreenDialogFragment<DialogLoadingBinding>() {

    override fun onCreateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = DialogLoadingBinding.inflate(inflater, container, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.AppTheme_Dialog_Loading)
        isCancelable = false
    }

    companion object {
        const val TAG = "LoadingDialogFragment"

        fun newInstance() = LoadingDialogFragment()
    }
}