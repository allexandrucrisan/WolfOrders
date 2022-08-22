package com.example.wolforders.data.model.entity

import com.google.gson.annotations.SerializedName


data class Item(

    @SerializedName("itemName") var itemName: String? = null,
    @SerializedName("image") var image: String? = null,
    @SerializedName("price") var price: Int? = null

)

data class ItemData(
    @SerializedName("items")
    val items: List<Item>
)

