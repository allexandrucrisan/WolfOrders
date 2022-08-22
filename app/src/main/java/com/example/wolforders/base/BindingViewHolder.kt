package com.example.wolforders.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView


abstract class BindingViewHolder<T>(val dataBinding: ViewDataBinding) : RecyclerView.ViewHolder(dataBinding.root) {

    abstract fun onBind(item: T, position: Int = -1)
}