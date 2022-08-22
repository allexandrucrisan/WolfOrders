package com.example.wolforders.extension

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleOwner
import com.google.android.material.snackbar.Snackbar
import com.example.wolforders.common.network.NetworkLiveData

fun <T : AppCompatActivity> Activity.startNewActivity(
    newActivity: Class<T>,
    extras: Bundle? = null
) {
    val newActivityIntent = Intent(this, newActivity)

    if (extras != null) {
        startActivity(newActivityIntent, extras)
    } else {
        startActivity(newActivityIntent)
    }
}

/**
 * Extension function for starting a new activity from current activity
 * @param newActivity The component class that is to be used for the intent.
 * @param finishCurrent Boolean indicating whether to finish current activity or not.
 */
fun <T : AppCompatActivity> Activity.startNewActivity(
    newActivity: Class<T>,
    finishCurrent: Boolean
) {
    val newActivityIntent = Intent(this, newActivity)
    startActivity(newActivityIntent)
    if (finishCurrent) {
        this.finish()
    }
}

/**
 * Extension function for starting to observe network connection in activity
 * @param snackbar Snackbar for show no network message.
 * @param onNetworkAliveCallback A lambda that is executed when the connection is back.
 * @param anchorView A view that the snackbar should be anchored above.
 */

fun LifecycleOwner.setupNetworkObserver(
    snackbar: Snackbar?,
    anchorView: View? = null,
    onNetworkAliveCallback: (() -> Unit)? = null,
    onNetworkLostCallback: (() -> Unit)? = null
) {
    NetworkLiveData.observe(this, { hasNetwork ->
        hasNetwork?.let {
            if (hasNetwork) {
                onNetworkAliveCallback?.invoke()
                snackbar?.dismiss()
            } else {
                snackbar?.anchorView = anchorView
                onNetworkLostCallback?.invoke()
                snackbar?.show()
            }
        } ?: snackbar?.dismiss()
    })
}