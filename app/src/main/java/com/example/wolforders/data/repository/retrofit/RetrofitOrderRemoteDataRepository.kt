package com.example.wolforders.data.repository.retrofit

import com.example.wolforders.data.datasource.NetworkDataSource
import com.example.wolforders.data.model.repository.OrderRemoteDataRepository
import com.example.wolforders.data.repository.retrofit.model.OrderData
import com.example.wolforders.data.model.repository.common.Result
import com.example.wolforders.data.repository.retrofit.model.OrderNetworkResponse


class RetrofitOrderRemoteDataRepository(
    private val orderApi: OrderApi,
    private val networkDataSource: NetworkDataSource
) : OrderRemoteDataRepository {

    override suspend fun getAllProjects(
    ): Result<OrderNetworkResponse<OrderData?>> {
        return networkDataSource.getResult {
            OrderNetworkResponse(
                orderApi.getAllProjects()
            )
        }
    }
}