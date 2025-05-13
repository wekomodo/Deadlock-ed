package com.wekomodo.deadlockcompanion.domain

import android.util.Log
import com.wekomodo.deadlockcompanion.data.remote.InterfaceAPI
import com.wekomodo.deadlockcompanion.data.remote.model.ShopItems.ShopItem
import javax.inject.Inject

class MainRepository @Inject constructor(private val api: InterfaceAPI) {
    val TAG = "REPOSITORY"
    suspend fun getHeroes() : String {
        Log.d(TAG,"Get heroes called")
        return api.getHeroes()
    }


    suspend fun getShopItemsByType(type : String) : ShopItem? {
        Log.d(TAG, "get Shop Items called")
        return api.getShopItemsByType(type)

    }
}