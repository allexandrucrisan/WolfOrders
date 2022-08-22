package com.example.wolforders.ui.orders

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.wolforders.common.util.AbsentLiveData
import com.example.wolforders.data.model.entity.WolfOrder
import com.example.wolforders.data.repository.OrderRepository

class OrdersViewModel(
    private val ordersRepository: OrderRepository
) : ViewModel() {

    private val _shouldGetList = MutableLiveData<Boolean>()
    private val _ordersList = MutableLiveData<List<WolfOrder>>()

    val remoteOrders = Transformations
        .switchMap(_shouldGetList) {
            ordersRepository.getOrders()

        }

    val saveListInDb = Transformations
        .switchMap(_ordersList) { orders ->
            if (orders == null) {
                AbsentLiveData.create()
            } else {
                ordersRepository.saveOrders(orders)
            }
        }

    fun getRemoteList() {
        _shouldGetList.postValue(true)
    }

    fun setLocalList(list: List<WolfOrder>) {
        _ordersList.postValue(list)
    }
}