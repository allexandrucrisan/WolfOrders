package com.example.wolforders.ui.details

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class DetailsFragmentArgs(
  public val projectId: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("projectId", this.projectId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("projectId", this.projectId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __projectId : String?
      if (bundle.containsKey("projectId")) {
        __projectId = bundle.getString("projectId")
        if (__projectId == null) {
          throw IllegalArgumentException("Argument \"projectId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"projectId\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__projectId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): DetailsFragmentArgs {
      val __projectId : String?
      if (savedStateHandle.contains("projectId")) {
        __projectId = savedStateHandle["projectId"]
        if (__projectId == null) {
          throw IllegalArgumentException("Argument \"projectId\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"projectId\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__projectId)
    }
  }
}
