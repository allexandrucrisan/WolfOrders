package com.example.wolforders.data.api

import com.example.wolforders.data.models.OrdersData
import io.reactivex.Single
import retrofit2.http.GET

interface RetrofitInterface {
    @GET("orders")
    fun getOrdersRemote(): Single<OrdersData>
}