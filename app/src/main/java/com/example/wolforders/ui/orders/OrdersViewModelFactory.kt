package com.example.wolforders.ui.orders

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.wolforders.data.repository.OrderRepository

class OrdersViewModelFactory(
    private val repository: OrderRepository
) :
    ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        require(modelClass == OrdersViewModel::class.java) { "Unknown ViewModel class" }
        return OrdersViewModel(repository) as T
    }
}