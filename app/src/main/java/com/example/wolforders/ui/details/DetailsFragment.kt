package com.example.wolforders.ui.details

import android.content.ContentValues
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.wolforders.R
import com.example.wolforders.common.binding.FragmentDataBindingComponent
import com.example.wolforders.common.util.autoCleared
import com.example.wolforders.databinding.FragmentDetailsBinding
import com.example.wolforders.databinding.FragmentOrdersBinding
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class DetailsFragment : Fragment() {

    private val params by navArgs<DetailsFragmentArgs>()

    private val viewModel: DetailsViewModel by inject { parametersOf(this) }

    private var binding by autoCleared<FragmentDetailsBinding>()
    private var dataBindingComponent: DataBindingComponent = FragmentDataBindingComponent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.setOrderId(params.orderId)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dataBinding = DataBindingUtil.inflate<FragmentDetailsBinding>(
            inflater,
            R.layout.fragment_details,
            container,
            false,
            dataBindingComponent
        )

        binding = dataBinding
        return dataBinding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.lifecycleOwner = viewLifecycleOwner
        setViewModelObservable()
    }

    private fun setViewModelObservable() {
        viewModel.getOrderDetails.observe(viewLifecycleOwner) { order ->
            if (order != null) {
                binding.order = order
            }
        }
    }

}