package com.example.wolforders.data.models

import com.google.gson.annotations.SerializedName

data class Item(

    @SerializedName("itemName") var itemName: String? = null,
    @SerializedName("image") var image: String? = null,
    @SerializedName("price") var price: Int? = null

)