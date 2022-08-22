package com.example.wolforders.ui.orders

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.wolforders.R
import com.example.wolforders.common.binding.FragmentDataBindingComponent
import com.example.wolforders.common.util.autoCleared
import com.example.wolforders.databinding.FragmentOrdersBinding
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class OrdersFragment : Fragment() {

    private val viewModel: OrdersViewModel by inject { parametersOf(this) }

    private lateinit var ordersAdapter: OrdersAdapter

    private var binding by autoCleared<FragmentOrdersBinding>()
    private var dataBindingComponent: DataBindingComponent = FragmentDataBindingComponent()

    companion object {
        const val ORDER_ID_KEY = "orderId"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getRemoteList()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dataBinding = DataBindingUtil.inflate<FragmentOrdersBinding>(
            inflater,
            R.layout.fragment_orders,
            container,
            false,
            dataBindingComponent
        )

        binding = dataBinding
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.lifecycleOwner = viewLifecycleOwner
        createAdapters()
        setViewModelObservable()
    }

    private fun createAdapters() {
        ordersAdapter = OrdersAdapter(dataBindingComponent) {
            val bundle = bundleOf(ORDER_ID_KEY to it.id)
            findNavController().navigate(R.id.navigation_details, bundle)
        }
        binding.ordersListRecyclerView.adapter = ordersAdapter
    }

    private fun setViewModelObservable() {
        viewModel.remoteOrders.observe(viewLifecycleOwner) { orders ->
            if (orders != null) {
                ordersAdapter.submitList(orders.data)
                viewModel.setLocalList(orders.data)
            }
        }
        viewModel.saveListInDb.observe(viewLifecycleOwner) { orders ->
            if (orders != null) {
                Log.d(TAG, "Saved Order: $orders")
            }
        }
    }
}