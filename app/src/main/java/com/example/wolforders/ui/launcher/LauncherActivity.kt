package com.example.wolforders.ui.launcher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.wolforders.MainActivity
import com.example.wolforders.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LauncherActivity : AppCompatActivity() {

    companion object {
        private const val DELAY_AUTH_DURATION = 3000L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)
        supportActionBar?.hide()

        lifecycleScope.launch {
            delay(DELAY_AUTH_DURATION)
            navigateToMain()
        }
    }

    private fun navigateToMain() {
        val newActivityIntent = Intent(this, MainActivity::class.java)
        startActivity(newActivityIntent)
    }
}