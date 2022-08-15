package com.example.wolforders.ui.orders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import com.example.wolforders.R
import com.example.wolforders.common.DataBoundListAdapter
import com.example.wolforders.data.models.Order
import com.example.wolforders.databinding.OrderItemLayoutBinding

class OrdersAdapter(
    private val dataBindingComponent: DataBindingComponent,
    private val orderClickCallback: ((Order) -> Unit)?
) : DataBoundListAdapter<Order, OrderItemLayoutBinding>(
    diffCallback = object : DiffUtil.ItemCallback<Order>() {
        override fun areItemsTheSame(oldItem: Order, newItem: Order): Boolean {
            return oldItem.orderId == newItem.orderId
        }

        override fun areContentsTheSame(oldItem: Order, newItem: Order): Boolean {
            return oldItem.orderId == newItem.orderId
        }
    }
) {

    override fun createBinding(parent: ViewGroup, viewType: Int): OrderItemLayoutBinding {
        return DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.order_item_layout,
            parent,
            false,
            dataBindingComponent
        )
    }

    override fun bind(binding: OrderItemLayoutBinding, item: Order, position: Int) {
        binding.order = item
        binding.total = getTotalOrderValue(item)
        binding.root.setOnClickListener {
            binding.order?.let {
                orderClickCallback?.invoke(it)
            }
        }
    }

    private fun getTotalOrderValue(order: Order): String {
        var total = 0
        for (item in order.items)
            total += item.price!!

        return total.toString()
    }
}