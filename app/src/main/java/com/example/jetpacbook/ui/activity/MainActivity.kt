package com.example.jetpacbook.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.example.jetpacbook.ui.screen.details.DetailScreen
import com.example.jetpacbook.ui.screen.main.MainScreen
import com.example.jetpacbook.ui.screen.topbar.CenteredTopBar
import com.example.jetpacbook.ui.sealed.Screen
import com.example.jetpacbook.ui.theme.JetpacBookTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var titleState = rememberSaveable { mutableStateOf("Библиотека") }
            var currentScreen by remember { mutableStateOf<Screen>(Screen.Main) }

            JetpacBookTheme {
                Scaffold(
                    topBar = { CenteredTopBar(title = titleState.value) }
                ){ padding ->
                    when(val screen = currentScreen){
                        is Screen.Main -> MainScreen(
                            padding = padding,
                            title = titleState,
                            onBookClick = { clickedBook ->
                                currentScreen = Screen.Detail(clickedBook)
                                titleState.value = clickedBook.name ?: ""
                            }
                        )
                        is Screen.Detail -> DetailScreen(
                            padding = padding,
                            title = titleState,
                            book = screen.book,
                            onBack = {
                                currentScreen = Screen.Main
                                titleState.value = "Библиотека"
                            }
                        )
                    }
                }
            }
        }
    }
}