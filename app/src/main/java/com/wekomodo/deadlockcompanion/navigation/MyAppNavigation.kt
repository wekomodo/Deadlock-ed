package com.wekomodo.deadlockcompanion.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wekomodo.deadlockcompanion.ui.screens.hereos.HeroesScreen
import com.wekomodo.deadlockcompanion.ui.screens.items.ShopItemScreen


@Composable
fun AppNavHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = Screen.Heroes.route, // Set your start destination
        modifier = modifier
    ) {
        composable(Screen.Heroes.route) {
            HeroesScreen()
        }
        composable(Screen.Items.route) {
            ShopItemScreen()
        }
        // Add more composable destinations here if needed
    }
}