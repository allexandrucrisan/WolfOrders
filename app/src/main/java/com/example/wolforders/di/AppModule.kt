package com.example.wolforders.di

import com.example.wolforders.data.coroutines.CoroutinesDispatcherProvider
import com.example.wolforders.data.datasource.LocalDataSource
import com.example.wolforders.data.datasource.NetworkDataSource
import com.example.wolforders.data.model.repository.OrderLocalDataRepository
import com.example.wolforders.data.model.repository.OrderRemoteDataRepository
import com.example.wolforders.data.repository.OrderRepository
import com.example.wolforders.data.repository.retrofit.OrderApi
import com.example.wolforders.data.repository.retrofit.RetrofitOrderRemoteDataRepository
import com.example.wolforders.data.repository.room.OrderDao
import com.example.wolforders.data.repository.room.RoomOrderLocalDataRepository
import com.example.wolforders.ui.details.detailsModule
import com.example.wolforders.ui.orders.ordersModule
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit

private val dataModules = module {
    single { provideLocalDataSource() }
    single { provideNetworkDataSource() }
    single { provideOrderApi(get()) }
    single { provideOrderRemoteDataRepository(get(), get()) }
    single { provideOrderLocalDataRepository(get(), get(), get()) }
    single { provideOrderRepository(get(), get()) }
}

private val baseModules: List<Module> =
    listOf(coroutinesModule, roomModule, retrofitNetworkModule)

private val screenModules: List<Module> = listOf(
    ordersModule,
    detailsModule
)
val appModules: List<Module> = listOf(dataModules) + baseModules + screenModules

private fun provideLocalDataSource(): LocalDataSource {
    return LocalDataSource()
}

private fun provideNetworkDataSource(): NetworkDataSource {
    return NetworkDataSource()
}

private fun provideOrderApi(retrofitInstance: Retrofit): OrderApi {
    return retrofitInstance.create(OrderApi::class.java)
}

private fun provideOrderLocalDataRepository(
    orderDao: OrderDao,
    localDataSource: LocalDataSource,
    coroutineDispatcher: CoroutinesDispatcherProvider
): OrderLocalDataRepository {
    return RoomOrderLocalDataRepository(orderDao, localDataSource, coroutineDispatcher)
}

private fun provideOrderRemoteDataRepository(
    orderApi: OrderApi,
    networkDataSource: NetworkDataSource
): OrderRemoteDataRepository {
    return RetrofitOrderRemoteDataRepository(orderApi, networkDataSource)
}

private fun provideOrderRepository(
    orderRemoteDataRepository: OrderRemoteDataRepository,
    orderLocalDataRepository: OrderLocalDataRepository
): OrderRepository {
    return OrderRepository(orderRemoteDataRepository, orderLocalDataRepository)
}