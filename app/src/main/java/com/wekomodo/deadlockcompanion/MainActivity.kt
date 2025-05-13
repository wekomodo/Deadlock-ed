package com.wekomodo.deadlockcompanion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.wekomodo.deadlockcompanion.domain.MainViewModel
import com.wekomodo.deadlockcompanion.navigation.AppNavHost
import com.wekomodo.deadlockcompanion.ui.screens.HomeScreen
import com.wekomodo.deadlockcompanion.ui.theme.DeadlockCompanionTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DeadlockCompanionTheme {
                val navController = rememberNavController()
                HomeScreen(navController)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainPreview() {

}