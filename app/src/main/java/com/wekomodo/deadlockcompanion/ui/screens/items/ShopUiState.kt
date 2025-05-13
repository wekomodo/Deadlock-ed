package com.wekomodo.deadlockcompanion.ui.screens.items

import androidx.compose.runtime.Immutable
import com.wekomodo.deadlockcompanion.data.remote.model.ShopItems.ShopItemItem

@Immutable
data class ShopUiState(
    val list : List<ShopItemItem> = emptyList(),
    val loading : Boolean = false,
    val error: Boolean = false,
)