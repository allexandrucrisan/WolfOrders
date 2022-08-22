package com.example.wolforders.ui.orders

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.wolforders.data.repository.OrderRepository
import org.koin.dsl.module

val ordersModule = module {
    factory { (fragment: Fragment) -> provideViewModel(fragment, get()) }
}

private fun provideViewModel(
    fragment: Fragment,
    repository: OrderRepository
): OrdersViewModel {
    return ViewModelProvider(
        fragment,
        OrdersViewModelFactory(repository)
    )[OrdersViewModel::class.java]
}