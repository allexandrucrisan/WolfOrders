package com.example.wolforders.di

import com.example.wolforders.ui.orders.ordersModule
import org.koin.dsl.module

val appModules = module {

    ordersModule
    retrofitNetworkModule

}