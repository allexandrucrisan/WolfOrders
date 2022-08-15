package com.example.wolforders.ui.orders

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.wolforders.data.models.OrdersData
import com.example.wolforders.data.repositories.OrdersRepository
import com.veselovvv.movies.data.NetworkState
import io.reactivex.disposables.CompositeDisposable

class OrdersViewModel(
    private val ordersRepository: OrdersRepository
) : ViewModel() {
    private val compositeDisposable = CompositeDisposable()

    val getOrders: LiveData<OrdersData> by lazy {
        ordersRepository.fetchOrders(compositeDisposable)
    }

    val networkState: LiveData<NetworkState> by lazy {
        ordersRepository.getOrdersNetworkState()
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}