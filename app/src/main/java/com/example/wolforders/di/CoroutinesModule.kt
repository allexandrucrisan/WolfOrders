package com.example.wolforders.di

import com.example.wolforders.data.coroutines.CoroutinesDispatcherProvider
import org.koin.dsl.module

val coroutinesModule = module {
    single { CoroutinesDispatcherProvider() }
}