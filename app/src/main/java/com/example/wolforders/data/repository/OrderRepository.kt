package com.example.wolforders.data.repository

import androidx.lifecycle.liveData
import com.example.wolforders.data.model.entity.WolfOrder
import com.example.wolforders.data.model.repository.common.Failure
import com.example.wolforders.data.model.repository.common.Success
import com.example.wolforders.data.model.repository.OrderLocalDataRepository
import com.example.wolforders.data.model.repository.OrderRemoteDataRepository

class OrderRepository(
    private val orderRemoteDataRepository: OrderRemoteDataRepository,
    private val orderLocalDataRepository: OrderLocalDataRepository
) {
    fun getOrders() = liveData {
        when (val result = orderRemoteDataRepository.getAllProjects()) {
            is Success -> {
                emit(result.data.data)
            }
            is Failure -> {
                emit(null)
            }
        }
    }

    fun getOrderDetails(orderId: Int) = liveData {
        when (val result = orderLocalDataRepository.getOrder(orderId)) {
            is Success -> {
                emit(result.data.data.value)
            }
            is Failure -> {
                emit(null)
            }
        }
    }

    fun saveOrders(wolfOrders: List<WolfOrder>) = liveData {
        when (val result = orderLocalDataRepository.saveOrders(wolfOrders)) {
            is Success -> {
                emit(result.data.data.value)
            }
            is Failure -> {
                emit(null)
            }
        }
    }
}