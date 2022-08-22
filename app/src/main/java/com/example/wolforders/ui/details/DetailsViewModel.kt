package com.example.wolforders.ui.details

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.wolforders.data.repository.OrderRepository

class DetailsViewModel(private val orderRepository: OrderRepository) : ViewModel() {
    private val _orderId = MutableLiveData<Int>()

    val getOrderDetails = Transformations
        .switchMap(_orderId) { orderId ->
            orderRepository.getOrderDetails(orderId)

        }

    fun setOrderId(orderID: Int) {
        _orderId.postValue(orderID)
    }
}