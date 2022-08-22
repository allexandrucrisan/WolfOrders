package com.example.wolforders

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
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

//        val navHostFragment =  supportFragmentManager
//            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment

//        navController = findNavController(R.id.nav_host_fragment)
//        navController = navHostFragment.navController

//        navController?.setGraph(R.navigation.app_nav)



       val  navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
    }
}