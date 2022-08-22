package com.example.wolforders.data.repository.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.wolforders.data.model.entity.WolfOrder

@Dao
interface OrderDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @JvmSuppressWildcards
    fun insertOrders(wolfOrders: List<WolfOrder>): List<Long>

    @Query("SELECT * FROM wolf_order WHERE id=:orderId")
    fun getOrder(orderId: Int): LiveData<WolfOrder?>
}
