package com.example.wolforders.data.repository.room.model

import androidx.lifecycle.LiveData
import com.example.wolforders.data.model.response.DatabaseResponse

class OrderDatabaseResponse<T>(val data: LiveData<T>) : DatabaseResponse()