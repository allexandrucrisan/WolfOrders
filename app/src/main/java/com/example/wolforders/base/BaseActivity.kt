package com.example.wolforders.base

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.example.wolforders.R
import com.google.android.material.snackbar.Snackbar
import com.example.wolforders.common.network.NetworkLiveData
import com.example.wolforders.extension.setupNetworkObserver

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        NetworkLiveData.init(getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager)
        setupNetworkObserver(makeSnackBar(findViewById(android.R.id.content), getString(R.string.no_internet_connection)))
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        if (currentFocus != null) {
            hideKeyboard()
        }
        return super.dispatchTouchEvent(ev)
    }

    private fun hideKeyboard() {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
    }

    private fun makeSnackBar(parentLayout: View, message: String): Snackbar {
        return Snackbar.make(parentLayout, message, Snackbar.LENGTH_INDEFINITE)
    }
}