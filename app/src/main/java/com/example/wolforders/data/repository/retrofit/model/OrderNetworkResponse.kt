package com.example.wolforders.data.repository.retrofit.model

import com.example.wolforders.data.model.response.NetworkResponse

class OrderNetworkResponse<T>(val data: T) : NetworkResponse()