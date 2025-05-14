package com.wekomodo.deadlockcompanion.di

import android.util.Log
import com.wekomodo.deadlockcompanion.BuildConfig
import com.wekomodo.deadlockcompanion.Util.Constant
import com.wekomodo.deadlockcompanion.data.remote.InterfaceAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.logging.SIMPLE
import io.ktor.client.request.header
import io.ktor.http.URLProtocol
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    val TAG = "APPMODULE"
    val API_key = BuildConfig.apiKey

    @Singleton
    @Provides
    fun provideKtorClient() : HttpClient {
        //custom header
        val client = HttpClient(CIO){
            install(ContentNegotiation){
                json( Json{
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                })
            }
            defaultRequest {
                url {
                    protocol = URLProtocol.HTTPS
                    host = Constant.BASE_URL
                    Log.d("KtorClient", "Default Request Host being set to: ${Constant.BASE_URL}")
                }
                header("X-API-Key",API_key)
            }
            // Install and configure the Logging plugin
            install(Logging) {
                logger = Logger.SIMPLE// Use the simple Android logger
                level = LogLevel.ALL // Log everything (headers, body, etc.)
            }

        }
       Log.d(TAG, "Provided HttpClient instance: $client")
       return client
    }

    @Singleton
    @Provides
    fun provideAPI(client: HttpClient) : InterfaceAPI {
        return InterfaceAPI(client)
    }
}