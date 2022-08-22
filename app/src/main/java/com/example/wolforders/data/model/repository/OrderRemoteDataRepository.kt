package com.example.wolforders.data.model.repository

import com.example.wolforders.data.model.repository.common.Result
import com.example.wolforders.data.repository.retrofit.model.OrderData
import com.example.wolforders.data.repository.retrofit.model.OrderNetworkResponse

interface OrderRemoteDataRepository {

    suspend fun getAllProjects(): Result<OrderNetworkResponse<OrderData?>>

}