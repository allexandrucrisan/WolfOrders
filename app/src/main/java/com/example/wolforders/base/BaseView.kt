package com.example.wolforders.base

interface BaseView<out T : BaseViewModel<*>> {
    val viewModel: T
}