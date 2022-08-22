package com.example.wolforders.base

import com.example.wolforders.data.model.repository.common.Result

interface BaseDataSource<T: BaseResponse> {

    suspend fun <Y: T> getResult(call: suspend () -> Y): Result<Y>

}