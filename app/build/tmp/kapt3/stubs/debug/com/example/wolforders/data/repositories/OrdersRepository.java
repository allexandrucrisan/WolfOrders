package com.example.wolforders.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/example/wolforders/data/repositories/OrdersRepository;", "", "apiService", "Lcom/example/wolforders/data/api/RetrofitInterface;", "(Lcom/example/wolforders/data/api/RetrofitInterface;)V", "ordersDataSource", "Lcom/example/wolforders/data/datasources/OrdersDataSource;", "getOrdersDataSource", "()Lcom/example/wolforders/data/datasources/OrdersDataSource;", "setOrdersDataSource", "(Lcom/example/wolforders/data/datasources/OrdersDataSource;)V", "fetchOrders", "Landroidx/lifecycle/LiveData;", "Lcom/example/wolforders/data/models/OrdersData;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getOrdersNetworkState", "Lcom/veselovvv/movies/data/NetworkState;", "app_debug"})
public final class OrdersRepository {
    private final com.example.wolforders.data.api.RetrofitInterface apiService = null;
    public com.example.wolforders.data.datasources.OrdersDataSource ordersDataSource;
    
    public OrdersRepository(@org.jetbrains.annotations.NotNull()
    com.example.wolforders.data.api.RetrofitInterface apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.wolforders.data.datasources.OrdersDataSource getOrdersDataSource() {
        return null;
    }
    
    public final void setOrdersDataSource(@org.jetbrains.annotations.NotNull()
    com.example.wolforders.data.datasources.OrdersDataSource p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.wolforders.data.models.OrdersData> fetchOrders(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.veselovvv.movies.data.NetworkState> getOrdersNetworkState() {
        return null;
    }
}