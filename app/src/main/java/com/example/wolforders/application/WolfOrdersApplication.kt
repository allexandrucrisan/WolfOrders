package com.example.wolforders.application

import android.app.Application
import com.example.wolforders.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class WolfOrdersApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@WolfOrdersApplication)
            androidFileProperties()
            modules(appModules)
        }

    }
}