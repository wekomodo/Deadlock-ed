package com.wekomodo.deadlockcompanion.data.remote

import android.util.Log
import com.wekomodo.deadlockcompanion.data.remote.model.ShopItems.ShopItem
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.path
import javax.inject.Inject


class InterfaceAPI @Inject constructor(private val client: HttpClient){
    val TAG = "INTERFACE API"

    suspend fun getHeroes() : String {
        Log.d(TAG,"get Heroes called")
        return try{
            client.get {
                url{
                    path("/v2/heroes")
                }
           }.body()
        } catch (e: Exception){
            e.message.toString()
        }
    }

    suspend fun getHero( id : String) : String {
        Log.d(TAG,"get Hero called")
        return try{
            client.get {
                url{
                    path("/v2/heroes/${id}")
                }
            }.body()
        } catch (e: Exception){
            e.message.toString()
        }
    }

    suspend fun getShopItemsByType(type : String) : ShopItem? {
        Log.d(TAG, "get Shop Items called")
        return try {
            client.get {
                url{
                    path("v2/items/by-slot-type/$type")
                }
            }.body()
        }
        catch ( e : Exception){
            Log.d(TAG, e.message.toString())
            null
        }
    }
}