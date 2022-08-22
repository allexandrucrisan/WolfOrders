package com.example.wolforders.data.datasource

import com.example.wolforders.base.BaseDataSource
import com.example.wolforders.data.model.repository.common.Failure
import com.example.wolforders.data.model.repository.common.Success
import com.example.wolforders.data.model.repository.common.Result
import com.example.wolforders.data.model.response.DatabaseResponse

class LocalDataSource : BaseDataSource<DatabaseResponse> {

    override suspend fun <T : DatabaseResponse> getResult(call: suspend () -> T): Result<T> {
        return try {
            Success(call())
        } catch (e: Exception) {
            e.printStackTrace()
            error(e.message ?: e.toString())
        }
    }

    private fun <T : DatabaseResponse> error(message: String): Result<T> {
        return Failure(Exception("Local request has failed for a following reason: $message"))
    }
}