package com.example.wolforders.common.binding

import androidx.databinding.DataBindingComponent
import com.example.wolforders.common.binding.FragmentBindingAdapter

class FragmentDataBindingComponent: DataBindingComponent {
    private val adapter = FragmentBindingAdapter()

    fun getFragmentBindingAdapters() = adapter
}