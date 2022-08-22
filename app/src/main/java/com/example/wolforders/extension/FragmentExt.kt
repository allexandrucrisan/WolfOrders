package com.qubiz.qbuzz.extension

import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

/**
 * Extension function for showing a toast message for a short period [Toast.LENGTH_SHORT]
 * @param message The message that should appear on the screen
 */
fun Fragment.showToast(message: String) {
    Toast.makeText(this.context, message, Toast.LENGTH_SHORT).show()
}

/**
 * Extension function for showing a toast message for a long period [Toast.LENGTH_LONG]
 * @param message The message that should appear on the screen
 */
fun Fragment.showToastLong(message: String) {
    Toast.makeText(this.context, message, Toast.LENGTH_LONG).show()
}

fun Fragment.hideActionBarLogo() {
    (requireActivity() as AppCompatActivity).supportActionBar?.setDisplayShowHomeEnabled(false)
}

fun Fragment.setActionBarElevation(elevation: Float) {
    (requireActivity() as AppCompatActivity).supportActionBar?.elevation = elevation
}

/**
 * Extension function for retrieving the OnBackPressedDispatcher that will be triggered when
 * up button is clicked.
 * @param actionFunc Lambda expression that executed after up button is clicked
 */
fun Fragment.setBackButtonDispatcher(actionFunc: () -> Unit) {
    val callback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            actionFunc()
        }
    }
    requireActivity().onBackPressedDispatcher.addCallback(this, callback)
}