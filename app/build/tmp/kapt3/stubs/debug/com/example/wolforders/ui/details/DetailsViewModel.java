package com.example.wolforders.ui.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/wolforders/ui/details/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "orderRepository", "Lcom/example/wolforders/data/repository/OrderRepository;", "(Lcom/example/wolforders/data/repository/OrderRepository;)V", "_orderId", "Landroidx/lifecycle/MutableLiveData;", "", "getOrderDetails", "Landroidx/lifecycle/LiveData;", "Lcom/example/wolforders/data/model/entity/WolfOrder;", "getGetOrderDetails", "()Landroidx/lifecycle/LiveData;", "setOrderId", "", "orderID", "app_debug"})
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.wolforders.data.repository.OrderRepository orderRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _orderId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.wolforders.data.model.entity.WolfOrder> getOrderDetails = null;
    
    public DetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.wolforders.data.repository.OrderRepository orderRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.wolforders.data.model.entity.WolfOrder> getGetOrderDetails() {
        return null;
    }
    
    public final void setOrderId(int orderID) {
    }
}