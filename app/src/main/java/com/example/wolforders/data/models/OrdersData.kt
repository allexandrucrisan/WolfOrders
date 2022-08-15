package com.example.wolforders.data.models

import com.google.gson.annotations.SerializedName

data class OrdersData(
    @SerializedName("data")
    val orders: List<Order>,
)