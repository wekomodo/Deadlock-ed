package com.wekomodo.deadlockcompanion.domain

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wekomodo.deadlockcompanion.data.remote.model.ShopItems.ShopItem
import com.wekomodo.deadlockcompanion.data.remote.model.ShopItems.ShopItemItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: MainRepository) : ViewModel() {
    val TAG = "VIEWMODEL"
    private val _items = MutableStateFlow<ShopItem?>(null)
    val items: StateFlow<ShopItem?> = _items

    init {
        getShopItemsByType("weapon")
    }

    private fun getHeroes() {
        Log.d(TAG, "getHeroes called")
        viewModelScope.launch {
            repository.getHeroes()
        }

    }


    private fun getShopItemsByType(type : String) {
        Log.d(TAG, "get Shop Items called")
        viewModelScope.launch {
            _items.value = repository.getShopItemsByType(type)
        }
    }
}