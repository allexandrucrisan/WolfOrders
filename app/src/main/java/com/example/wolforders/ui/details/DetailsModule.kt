package com.example.wolforders.ui.details

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.wolforders.data.repository.OrderRepository
import org.koin.dsl.module

val detailsModule = module {
    factory { (fragment: Fragment) -> provideViewModel(fragment, get()) }
}

private fun provideViewModel(
    fragment: Fragment,
    repository: OrderRepository
): DetailsViewModel {
    return ViewModelProvider(
        fragment,
        DetailsViewModelFactory(repository)
    )[DetailsViewModel::class.java]
}