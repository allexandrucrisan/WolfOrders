package com.example.wolforders.data.model.repository.common

import com.example.wolforders.base.BaseResponse


sealed class Result<out T : BaseResponse?>
class Success<out T : BaseResponse?>(val data: T) : Result<T>()
class Failure(private val exception: Throwable, val message: String? = exception.localizedMessage) : Result<Nothing>()