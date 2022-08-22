package com.example.wolforders.ui.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.wolforders.data.repository.OrderRepository

class DetailsViewModelFactory(
    private val repository: OrderRepository
) :
    ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        require(modelClass == DetailsViewModel::class.java) { "Unknown ViewModel class" }
        return DetailsViewModel(repository) as T
    }
}