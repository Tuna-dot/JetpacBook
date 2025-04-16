package com.example.jetpacbook.ui.sealed

import com.example.jetpacbook.ui.model.BookModel

sealed class Screen {
    object Main : Screen()
    data class Detail(val book : BookModel) : Screen()
}