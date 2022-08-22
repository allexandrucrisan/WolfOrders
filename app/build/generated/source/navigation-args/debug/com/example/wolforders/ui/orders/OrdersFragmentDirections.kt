package com.example.wolforders.ui.orders

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.wolforders.R
import kotlin.Int

public class OrdersFragmentDirections private constructor() {
  private data class ActionNavigationOrdersToNavigationDetails(
    public val orderId: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_navigation_orders_to_navigation_details

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("orderId", this.orderId)
        return result
      }
  }

  public companion object {
    public fun actionNavigationOrdersToNavigationDetails(orderId: Int): NavDirections =
        ActionNavigationOrdersToNavigationDetails(orderId)
  }
}
