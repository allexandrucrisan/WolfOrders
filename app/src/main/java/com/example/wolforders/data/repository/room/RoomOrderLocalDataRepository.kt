package com.example.wolforders.data.repository.room

import androidx.lifecycle.MutableLiveData
import com.example.wolforders.data.coroutines.CoroutinesDispatcherProvider
import com.example.wolforders.data.datasource.LocalDataSource
import com.example.wolforders.data.model.entity.WolfOrder
import com.example.wolforders.data.model.repository.common.Result
import com.example.wolforders.data.model.repository.OrderLocalDataRepository
import com.example.wolforders.data.repository.room.model.OrderDatabaseResponse
import kotlinx.coroutines.withContext

class RoomOrderLocalDataRepository(
    private val orderDao: OrderDao,
    private val localDataSource: LocalDataSource,
    private val coroutineDispatcher: CoroutinesDispatcherProvider
) :
    OrderLocalDataRepository {


    override suspend fun getOrder(orderId: Int): Result<OrderDatabaseResponse<WolfOrder?>> {
        return localDataSource.getResult { OrderDatabaseResponse(orderDao.getOrder(orderId)) }
    }

    override suspend fun saveOrders(wolfOrders: List<WolfOrder>): Result<OrderDatabaseResponse<List<Long>>> {
        return withContext(coroutineDispatcher.io) {
            localDataSource.getResult {
                OrderDatabaseResponse(
                    MutableLiveData(
                        orderDao.insertOrders(
                            wolfOrders
                        )
                    )
                )
            }
        }
    }
}