package com.example.wolforders.ui.orders

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.wolforders.R
import kotlin.Int
import kotlin.String

public class OrdersFragmentDirections private constructor() {
  private data class ActionNavigationOrdersToNavigationDetails(
    public val projectId: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_navigation_orders_to_navigation_details

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("projectId", this.projectId)
        return result
      }
  }

  public companion object {
    public fun actionNavigationOrdersToNavigationDetails(projectId: String): NavDirections =
        ActionNavigationOrdersToNavigationDetails(projectId)
  }
}
