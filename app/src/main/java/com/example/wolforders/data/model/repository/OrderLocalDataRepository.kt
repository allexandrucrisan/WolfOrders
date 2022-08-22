package com.example.wolforders.data.model.repository

import com.example.wolforders.data.model.entity.WolfOrder
import com.example.wolforders.data.model.repository.common.Result

import com.example.wolforders.data.repository.room.model.OrderDatabaseResponse

interface OrderLocalDataRepository {

    suspend fun getOrder(orderId: Int): Result<OrderDatabaseResponse<WolfOrder?>>

    suspend fun saveOrders(wolfOrders: List<WolfOrder>): Result<OrderDatabaseResponse<List<Long>>>

}