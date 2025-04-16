package com.example.jetpacbook.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import com.example.jetpacbook.ui.screen.main.MainScreen
import com.example.jetpacbook.ui.screen.topbar.CenteredTopBar
import com.example.jetpacbook.ui.theme.JetpacBookTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var titleState = rememberSaveable { mutableStateOf("Библиотека") }
            JetpacBookTheme {
                Scaffold(
                    topBar = { CenteredTopBar(title = titleState.value) }
                ){ padding ->
                    MainScreen(padding, title = titleState)
                }
            }
        }
    }
}