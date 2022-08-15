package com.example.wolforders.data.models

import com.google.gson.annotations.SerializedName


data class Order(

    @SerializedName("orderId") var orderId: Int? = null,
    @SerializedName("status") var status: String? = null,
    @SerializedName("date") var date: String? = null,
    @SerializedName("client") var client: Client? = Client(),
    @SerializedName("items") var items: ArrayList<Item> = arrayListOf()

)