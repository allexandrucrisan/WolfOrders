package com.example.wolforders.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/example/wolforders/data/api/RetrofitInterface;", "", "getOrdersRemote", "Lio/reactivex/Single;", "Lcom/example/wolforders/data/models/OrdersData;", "app_debug"})
public abstract interface RetrofitInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "orders")
    public abstract io.reactivex.Single<com.example.wolforders.data.models.OrdersData> getOrdersRemote();
}