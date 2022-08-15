package com.example.wolforders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.wolforders.R
import com.example.wolforders.databinding.ActivityMainBinding
import com.example.wolforders.ui.orders.OrdersFragment

class MainActivity : AppCompatActivity() {

    private var navController: NavController? = null

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        navController?.setGraph(R.navigation.app_nav)
        navController = findNavController(R.id.nav_host_fragment)
    }
}