package com.wekomodo.deadlockcompanion.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import com.wekomodo.deadlockcompanion.R

sealed class Screen(val route: String, @StringRes val resourceId: Int, val icon: ImageVector) {
    object Heroes : Screen("heroes", R.string.screen_heroes, Icons.Filled.Face) // Example icon
    object Items : Screen("items", R.string.screen_items, Icons.Filled.Star) // Example icon
}