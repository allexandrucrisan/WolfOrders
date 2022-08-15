package com.example.wolforders.data.datasources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/example/wolforders/data/datasources/OrdersDataSource;", "", "apiService", "Lcom/example/wolforders/data/api/RetrofitInterface;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/example/wolforders/data/api/RetrofitInterface;Lio/reactivex/disposables/CompositeDisposable;)V", "_networkState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/veselovvv/movies/data/NetworkState;", "_ordersResponse", "Lcom/example/wolforders/data/models/OrdersData;", "networkState", "Landroidx/lifecycle/LiveData;", "getNetworkState", "()Landroidx/lifecycle/LiveData;", "ordersResponse", "getOrdersResponse", "fetchOrders", "", "app_debug"})
public final class OrdersDataSource {
    private final com.example.wolforders.data.api.RetrofitInterface apiService = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final androidx.lifecycle.MutableLiveData<com.veselovvv.movies.data.NetworkState> _networkState = null;
    private final androidx.lifecycle.MutableLiveData<com.example.wolforders.data.models.OrdersData> _ordersResponse = null;
    
    public OrdersDataSource(@org.jetbrains.annotations.NotNull()
    com.example.wolforders.data.api.RetrofitInterface apiService, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.veselovvv.movies.data.NetworkState> getNetworkState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.wolforders.data.models.OrdersData> getOrdersResponse() {
        return null;
    }
    
    public final void fetchOrders() {
    }
}