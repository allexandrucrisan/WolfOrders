package com.example.wolforders.data.repositories

import androidx.lifecycle.LiveData
import com.example.wolforders.data.api.RetrofitInterface
import com.example.wolforders.data.datasources.OrdersDataSource
import com.example.wolforders.data.models.OrdersData
import io.reactivex.disposables.CompositeDisposable

class OrdersRepository(private val apiService: RetrofitInterface) {
    lateinit var ordersDataSource: OrdersDataSource

    fun fetchOrders(
        compositeDisposable: CompositeDisposable
    ): LiveData<OrdersData> {
        ordersDataSource = OrdersDataSource(apiService, compositeDisposable)
        ordersDataSource.fetchOrders()
        return ordersDataSource.ordersResponse
    }

    fun getOrdersNetworkState() = ordersDataSource.networkState
}