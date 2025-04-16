package com.example.jetpacbook.ui.screen.details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.jetpacbook.ui.model.BookModel

@Composable
fun DetailScreen(
    padding: PaddingValues,
    title: MutableState<String>,
    book: BookModel,
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
            .padding(16.dp)
    ) {
        Button(onClick = { onBack() }) {
            Text("Назад")
        }

        Spacer(modifier = Modifier.height(16.dp))

        AsyncImage(
            model = book.image,
            contentDescription = book.name,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = book.name ?: "", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(text = "Автор: ${book.author ?: "Неизвестен"}", fontSize = 18.sp)
        Text(text = "Жанр: ${book.category ?: "Неизвестен"}", fontSize = 16.sp)
        Text(text = "Дата: ${book.date ?: "Неизвестна"}", fontSize = 14.sp, color = Color.Gray)
    }
}
