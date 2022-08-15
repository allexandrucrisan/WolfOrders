package com.example.wolforders.ui.orders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0010\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/wolforders/ui/orders/OrdersViewModel;", "Landroidx/lifecycle/ViewModel;", "ordersRepository", "Lcom/example/wolforders/data/repositories/OrdersRepository;", "(Lcom/example/wolforders/data/repositories/OrdersRepository;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getOrders", "Landroidx/lifecycle/LiveData;", "Lcom/example/wolforders/data/models/OrdersData;", "getGetOrders", "()Landroidx/lifecycle/LiveData;", "getOrders$delegate", "Lkotlin/Lazy;", "networkState", "Lcom/veselovvv/movies/data/NetworkState;", "getNetworkState", "networkState$delegate", "onCleared", "", "app_debug"})
public final class OrdersViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.wolforders.data.repositories.OrdersRepository ordersRepository = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy getOrders$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy networkState$delegate = null;
    
    public OrdersViewModel(@org.jetbrains.annotations.NotNull()
    com.example.wolforders.data.repositories.OrdersRepository ordersRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.wolforders.data.models.OrdersData> getGetOrders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.veselovvv.movies.data.NetworkState> getNetworkState() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}