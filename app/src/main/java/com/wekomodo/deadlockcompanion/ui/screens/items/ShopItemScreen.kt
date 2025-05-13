package com.wekomodo.deadlockcompanion.ui.screens.items

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.wekomodo.deadlockcompanion.domain.MainViewModel
import androidx.compose.runtime.getValue
import com.wekomodo.deadlockcompanion.data.remote.model.ShopItems.ShopItemItem

@Composable
fun ShopItemScreen(viewModel: MainViewModel = viewModel()) {
    val block by viewModel.items.collectAsState()
    Column {
        LazyColumn {
            block?.forEach { item ->
                ShopItemScreenItem(item)
            }

        }
    }
    Text("Items Screen Content")
}

@Composable
fun ShopItemScreenItem(item: ShopItemItem) {

}