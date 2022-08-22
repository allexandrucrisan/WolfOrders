package com.example.wolforders.common.network

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NetworkSharedViewModel : ViewModel() {

    private val _networkStatus = MutableLiveData<Boolean>()
    val networkStatus: LiveData<Boolean> get() = _networkStatus

    fun setNetworkStatus(status: Boolean) {
        this._networkStatus.value = status
    }
}
