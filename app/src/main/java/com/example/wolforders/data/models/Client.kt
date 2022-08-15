package com.example.wolforders.data.models

import com.google.gson.annotations.SerializedName


data class Client(

    @SerializedName("name") var name: String? = null,
    @SerializedName("address") var address: String? = null

)