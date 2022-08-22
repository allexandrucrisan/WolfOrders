package com.example.wolforders.ui.orders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/example/wolforders/ui/orders/OrdersViewModel;", "Landroidx/lifecycle/ViewModel;", "ordersRepository", "Lcom/example/wolforders/data/repository/OrderRepository;", "(Lcom/example/wolforders/data/repository/OrderRepository;)V", "_ordersList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/wolforders/data/model/entity/WolfOrder;", "_shouldGetList", "", "remoteOrders", "Landroidx/lifecycle/LiveData;", "Lcom/example/wolforders/data/repository/retrofit/model/OrderData;", "getRemoteOrders", "()Landroidx/lifecycle/LiveData;", "saveListInDb", "", "getSaveListInDb", "getRemoteList", "", "setLocalList", "list", "app_debug"})
public final class OrdersViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.wolforders.data.repository.OrderRepository ordersRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _shouldGetList = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.wolforders.data.model.entity.WolfOrder>> _ordersList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.wolforders.data.repository.retrofit.model.OrderData> remoteOrders = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<java.lang.Long>> saveListInDb = null;
    
    public OrdersViewModel(@org.jetbrains.annotations.NotNull()
    com.example.wolforders.data.repository.OrderRepository ordersRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.wolforders.data.repository.retrofit.model.OrderData> getRemoteOrders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.Long>> getSaveListInDb() {
        return null;
    }
    
    public final void getRemoteList() {
    }
    
    public final void setLocalList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.wolforders.data.model.entity.WolfOrder> list) {
    }
}