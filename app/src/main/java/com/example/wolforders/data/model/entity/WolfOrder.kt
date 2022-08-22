package com.example.wolforders.data.model.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "wolf_order")
data class WolfOrder(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var orderId: Int? = null,
    var status: String? = null,
    var date: String? = null,
    @Embedded
    var client: Client? = Client(),
    @Embedded
    var item: Item? = Item()
)