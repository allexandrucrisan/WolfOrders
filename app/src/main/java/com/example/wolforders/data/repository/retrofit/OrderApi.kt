package com.example.wolforders.data.repository.retrofit

import com.example.wolforders.data.repository.retrofit.model.OrderData
import retrofit2.http.*

interface OrderApi {

    @GET("/orders")
    suspend fun getAllProjects(): OrderData?
}