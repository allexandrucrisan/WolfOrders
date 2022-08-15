package com.example.wolforders.data.datasources

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.wolforders.data.api.RetrofitInterface
import com.example.wolforders.data.models.OrdersData
import com.veselovvv.movies.data.NetworkState
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class OrdersDataSource(
    private val apiService: RetrofitInterface,
    private val compositeDisposable: CompositeDisposable
) {
    private val _networkState = MutableLiveData<NetworkState>()
    val networkState: LiveData<NetworkState>
        get() = _networkState

    private val _ordersResponse = MutableLiveData<OrdersData>()
    val ordersResponse: LiveData<OrdersData>
        get() = _ordersResponse

    fun fetchOrders() {
        _networkState.postValue(NetworkState.LOADING)

        try {
            compositeDisposable.add(
                apiService.getOrdersRemote()
                    .subscribeOn(Schedulers.io())
                    .subscribe({
                        _ordersResponse.postValue(it)
                        _networkState.postValue(NetworkState.LOADED)
                    }, {
                        _networkState.postValue(NetworkState.ERROR)
                    })
            )
        } catch (e: Exception) {
        }
    }
}