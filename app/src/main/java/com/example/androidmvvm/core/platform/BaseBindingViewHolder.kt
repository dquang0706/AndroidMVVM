package com.example.androidmvvm.core.platform

import androidx.viewbinding.ViewBinding

abstract class BaseBindingViewHolder<Item, VB : ViewBinding>(
    open val viewBinding: VB,
    onItemClickListener: ((Item) -> Unit)? = null,
) : BaseViewHolder<Item>(viewBinding.root, onItemClickListener) {
}