package com.example.wolforders.ui.orders

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import com.example.wolforders.R
import com.example.wolforders.common.binding.DataBoundListAdapter
import com.example.wolforders.data.model.entity.WolfOrder
import com.example.wolforders.databinding.OrderItemLayoutBinding

class OrdersAdapter(
    private val dataBindingComponent: DataBindingComponent,
    private val orderClickCallback: ((WolfOrder) -> Unit)?
) : DataBoundListAdapter<WolfOrder, OrderItemLayoutBinding>(
    diffCallback = object : DiffUtil.ItemCallback<WolfOrder>() {
        override fun areItemsTheSame(oldItem: WolfOrder, newItem: WolfOrder): Boolean {
            return oldItem.orderId == newItem.orderId
        }

        override fun areContentsTheSame(oldItem: WolfOrder, newItem: WolfOrder): Boolean {
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

    override fun bind(binding: OrderItemLayoutBinding, item: WolfOrder, position: Int) {
        binding.cardView.setCardBackgroundColor(Color.parseColor(getPositionColor(position)))
        binding.order = item
        binding.total = item.item?.price.toString()
        binding.root.setOnClickListener {
            binding.order?.let {
                orderClickCallback?.invoke(it)
            }
        }
    }

    private fun getPositionColor(position: Int): String {
        return if (position % 2 == 0) "#ffffff" else "#DCDCDC"
    }
}