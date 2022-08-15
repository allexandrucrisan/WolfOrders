package com.example.wolforders.ui.orders

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.wolforders.common.FragmentDataBindingComponent
import com.example.wolforders.data.api.RetrofitClient
import com.example.wolforders.data.repositories.OrdersRepository
import com.example.wolforders.databinding.FragmentOrdersBinding
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class OrdersFragment : Fragment() {

    private lateinit var viewModel: OrdersViewModel
    private lateinit var ordersRepository: OrdersRepository

    private var dataBindingComponent: DataBindingComponent = FragmentDataBindingComponent()
    private lateinit var ordersAdapter: OrdersAdapter

    private var _binding: FragmentOrdersBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val apiService = RetrofitClient.getClient()

        ordersRepository = OrdersRepository(apiService)
//        val model: OrdersViewModel by viewModels()
//        viewModel = model
//        viewModel = ViewModelProvider(this)[OrdersViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOrdersBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(requireActivity())[OrdersViewModel::class.java]
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getOrders
        setupRecyclerView()
        setViewModelObservable()
    }

    private fun setViewModelObservable() {
        viewModel.getOrders.observe(viewLifecycleOwner) {
            ordersAdapter.submitList(it.orders)
        }
    }

    private fun setupRecyclerView() {
        ordersAdapter = OrdersAdapter(dataBindingComponent) {
//            val bundle = bundleOf(PROJECT_ID_KEY to it.id)
//            findNavController().navigate(R.id.navigation_project_details, bundle)
        }
        binding.ordersListRecyclerView.adapter = ordersAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}