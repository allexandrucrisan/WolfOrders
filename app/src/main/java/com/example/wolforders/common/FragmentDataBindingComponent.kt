package com.example.wolforders.common

import androidx.databinding.DataBindingComponent
import com.example.wolforders.common.FragmentBindingAdapter

class FragmentDataBindingComponent: DataBindingComponent {
    private val adapter = FragmentBindingAdapter()

    fun getFragmentBindingAdapters() = adapter
}