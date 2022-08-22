package com.example.wolforders.di

import com.example.wolforders.BuildConfig
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.net.ssl.HostnameVerifier

private const val BASE_API_URL = "http://demo9580962.mockable.io/"

val retrofitNetworkModule = module {
    single { provideGson() }
    single { provideOkHttpClient() }
    single { provideRetrofit(get(), get()) }
}

private fun provideGson(): Gson {
    return GsonBuilder().create()
}

private fun provideOkHttpClient(): OkHttpClient {
    val httpLoggingInterceptor = HttpLoggingInterceptor()
    httpLoggingInterceptor.level =
        if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE

    val requestInterceptor = Interceptor {
        val ongoing = it.request().newBuilder()
        ongoing.addHeader("Content-Type", "application/json")
        it.proceed(ongoing.build())
    }

    return OkHttpClient.Builder()
        .connectTimeout(10L, TimeUnit.SECONDS)
        .readTimeout(10L, TimeUnit.SECONDS)
        .addInterceptor(httpLoggingInterceptor)
        .addInterceptor(requestInterceptor)
        .hostnameVerifier(HostnameVerifier { _, _ ->
            return@HostnameVerifier true
        })
        .build()
}

private fun provideRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create(gson))
        .baseUrl(BASE_API_URL)
        .client(okHttpClient)
        .build()
}

