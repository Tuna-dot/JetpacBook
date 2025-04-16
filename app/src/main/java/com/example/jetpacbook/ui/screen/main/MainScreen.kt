package com.example.jetpacbook.ui.screen.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpacbook.ui.model.BookModel
import coil.compose.rememberImagePainter
import com.example.jetpacbook.ui.screen.topbar.CenteredTopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    padding: PaddingValues,
    title: MutableState<String>
) {
    val categoryList = remember { mutableListOf<String>() }
    categoryList.addAll(
        listOf(
            "Фэнтези", "Научная фантастика", "Детектив", "Триллер", "Мистика", "Ужасы",
            "Приключения", "Исторический роман", "Романтика", "Драма", "Комедия",
            "Психологический триллер", "Политический триллер", "Антиутопия", "Утопия",
            "Биография", "Автобиография", "Мемуары", "Эпопея", "Эротика", "Юмор", "Сатира",
            "Постапокалипсис", "Киберпанк", "Стимпанк", "Магический реализм", "Социальная проза",
            "Философский роман", "Литература ужасов", "ЛитРПГ"
        )
    )

    val bookList = remember {
        mutableStateListOf(
            BookModel(
                name = "1984",
                author = "Джордж Оруэлл",
                date = "1949-06-08",
                image = "https://m.media-amazon.com/images/I/71kxa1-0mfL.jpg"
            ),
            BookModel(
                name = "Убить пересмешника",
                author = "Харпер Ли",
                date = "1960-07-11",
                image = "https://m.media-amazon.com/images/I/81OtwFxoK9L.jpg"
            ),
            BookModel(
                name = "Мастер и Маргарита",
                author = "Михаил Булгаков",
                date = "1967-01-01",
                image = "https://m.media-amazon.com/images/I/81Kr-4DPSUL.jpg"
            ),
            BookModel(
                name = "Преступление и наказание",
                author = "Фёдор Достоевский",
                date = "1866-01-01",
                image = "https://m.media-amazon.com/images/I/81r3FVfNG3L.jpg"
            ),
            BookModel(
                name = "Война и мир",
                author = "Лев Толстой",
                date = "1869-01-01",
                image = "https://m.media-amazon.com/images/I/91b0C2YNSrL.jpg"
            ),
            BookModel(
                name = "Анна Каренина",
                author = "Лев Толстой",
                date = "1878-01-01",
                image = "https://m.media-amazon.com/images/I/71pDOhvNyFL.jpg"
            ),
            BookModel(
                name = "Маленький принц",
                author = "Антуан де Сент-Экзюпери",
                date = "1943-04-06",
                image = "https://m.media-amazon.com/images/I/81tJkQ3wSPL.jpg"
            ),
            BookModel(
                name = "Гарри Поттер и философский камень",
                author = "Дж. К. Роулинг",
                date = "1997-06-26",
                image = "https://m.media-amazon.com/images/I/81YOuOGFCJL.jpg"
            ),
            BookModel(
                name = "Властелин колец",
                author = "Дж. Р. Р. Толкин",
                date = "1954-07-29",
                image = "https://m.media-amazon.com/images/I/91ztRkTfL+L.jpg"
            ),
            BookModel(
                name = "Хоббит",
                author = "Дж. Р. Р. Толкин",
                date = "1937-09-21",
                image = "https://m.media-amazon.com/images/I/81cMfOIfKFL.jpg"
            ),
            BookModel(
                name = "Игра престолов",
                author = "Джордж Р. Р. Мартин",
                date = "1996-08-06",
                image = "https://m.media-amazon.com/images/I/91b0C2YNSrL.jpg"
            ),
            BookModel(
                name = "Код да Винчи",
                author = "Дэн Браун",
                date = "2003-03-18",
                image = "https://m.media-amazon.com/images/I/81t2CVWEsUL.jpg"
            ),
            BookModel(
                name = "Шантарам",
                author = "Грегори Дэвид Робертс",
                date = "2003-10-13",
                image = "https://m.media-amazon.com/images/I/81eB+7+CkUL.jpg"
            ),
            BookModel(
                name = "Тень горы",
                author = "Грегори Дэвид Робертс",
                date = "2015-10-13",
                image = "https://m.media-amazon.com/images/I/81JNkF9z6CL.jpg"
            ),
            BookModel(
                name = "Атлант расправил плечи",
                author = "Айн Рэнд",
                date = "1957-10-10",
                image = "https://m.media-amazon.com/images/I/81s6DUyQCZL.jpg"
            ),
            BookModel(
                name = "Цветы для Элджернона",
                author = "Дэниел Киз",
                date = "1966-01-01",
                image = "https://m.media-amazon.com/images/I/81GqtNbs+PL.jpg"
            ),
            BookModel(
                name = "451 градус по Фаренгейту",
                author = "Рэй Брэдбери",
                date = "1953-10-19",
                image = "https://m.media-amazon.com/images/I/71OFqSRFDgL.jpg"
            ),
            BookModel(
                name = "Над пропастью во ржи",
                author = "Джером Сэлинджер",
                date = "1951-07-16",
                image = "https://m.media-amazon.com/images/I/81OthjkJBuL.jpg"
            ),
            BookModel(
                name = "Заводной апельсин",
                author = "Энтони Бёрджесс",
                date = "1962-01-01",
                image = "https://m.media-amazon.com/images/I/91SZSW8qSsL.jpg"
            ),
            BookModel(
                name = "Дюна",
                author = "Фрэнк Герберт",
                date = "1965-08-01",
                image = "https://m.media-amazon.com/images/I/91A+4gR1zBL.jpg"
            ),
            BookModel(
                name = "Старик и море",
                author = "Эрнест Хемингуэй",
                date = "1952-09-01",
                image = "https://m.media-amazon.com/images/I/71zzEMnMvTL.jpg"
            ),
            BookModel(
                name = "Три товарища",
                author = "Эрих Мария Ремарк",
                date = "1936-01-01",
                image = "https://m.media-amazon.com/images/I/71e4yXk6BzL.jpg"
            ),
            BookModel(
                name = "Зов кукушки",
                author = "Роберт Галбрейт",
                date = "2013-04-30",
                image = "https://m.media-amazon.com/images/I/81tS1L+ZV+L.jpg"
            ),
            BookModel(
                name = "Джейн Эйр",
                author = "Шарлотта Бронте",
                date = "1847-10-16",
                image = "https://m.media-amazon.com/images/I/81JHv6zsjJL.jpg"
            ),
            BookModel(
                name = "Грозовой перевал",
                author = "Эмили Бронте",
                date = "1847-12-01",
                image = "https://m.media-amazon.com/images/I/81A7sKfzRRL.jpg"
            ),
            BookModel(
                name = "Шум и ярость",
                author = "Уильям Фолкнер",
                date = "1929-04-06",
                image = "https://m.media-amazon.com/images/I/91npqDbjXkL.jpg"
            ),
            BookModel(
                name = "Золотой телёнок",
                author = "Ильф и Петров",
                date = "1931-01-01",
                image = "https://m.media-amazon.com/images/I/81T2r3As6WL.jpg"
            ),
            BookModel(
                name = "День триффидов",
                author = "Джон Уиндем",
                date = "1951-01-01",
                image = "https://m.media-amazon.com/images/I/91dAzzg1IiL.jpg"
            ),
            BookModel(
                name = "Робот по имени Чаппи",
                author = "Герберт Уэллс",
                date = "1950-01-01",
                image = "https://m.media-amazon.com/images/I/81Qh7U3E-eL.jpg"
            ),
            BookModel(
                name = "Рыцарь святого Георгия",
                author = "Ричард Шеридан",
                date = "1953-06-16",
                image = "https://m.media-amazon.com/images/I/81-S9S13U2L.jpg"
            ),
            BookModel(
                name = "Задачи на воображение",
                author = "Джеймс Кларк",
                date = "2015-04-16",
                image = "https://m.media-amazon.com/images/I/91Z3U6mns2L.jpg"
            ),
            BookModel(
                name = "Станция 11",
                author = "Эмили Сент-Джон Мандел",
                date = "2014-09-09",
                image = "https://m.media-amazon.com/images/I/91NeQxbsJ5L.jpg"
            ),
            BookModel(
                name = "Сага о ведьмаке",
                author = "Анджей Сапковский",
                date = "1992-01-01",
                image = "https://m.media-amazon.com/images/I/81Ovb6zTR9L.jpg"
            ),
            BookModel(
                name = "Принцесса-невеста",
                author = "Уильям Голдман",
                date = "1973-01-01",
                image = "https://m.media-amazon.com/images/I/91ZvEmD59mL.jpg"
            ),
            BookModel(
                name = "Космическая одиссея",
                author = "Артур Кларк",
                date = "1968-04-01",
                image = "https://m.media-amazon.com/images/I/91QI7s6kA5L.jpg"
            ),
            BookModel(
                name = "Темная башня",
                author = "Стивен Кинг",
                date = "1982-01-01",
                image = "https://m.media-amazon.com/images/I/91t+PgsR2jL.jpg"
            ),
            BookModel(
                name = "Транслоция",
                author = "Джон Грир",
                date = "2000-12-11",
                image = "https://m.media-amazon.com/images/I/91PCIZOmyBL.jpg"
            ),
            BookModel(
                name = "Мир на пороге",
                author = "Бен Бове",
                date = "1998-06-15",
                image = "https://m.media-amazon.com/images/I/91W4uJl7y5L.jpg"
            ),
            BookModel(
                name = "Сержант Хартман",
                author = "Гэри Гриффит",
                date = "2017-02-21",
                image = "https://m.media-amazon.com/images/I/91F5gVJl61L.jpg"
            ),
            BookModel(
                name = "Дорога",
                author = "Кормак МакКарти",
                date = "2006-09-26",
                image = "https://m.media-amazon.com/images/I/81BRtG3dI2L.jpg"
            )
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
    ) {
        LazyRow(modifier = Modifier.fillMaxWidth()) {
            items(categoryList.size) { index ->
                Card(
                    modifier = Modifier
                        .padding(vertical = 20.dp, horizontal = 5.dp)
                        .clickable {
                        title.value = categoryList[index]
                    },
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = categoryList[index],
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp)
                    )
                }
            }
        }

        BookLibrary(dataList = bookList)
    }
}

@Composable
fun BookLibrary(dataList: List<BookModel>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dataList) { book ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Image(
                        painter = rememberImagePainter(
                            data = book.image,
                            builder = {
                                crossfade(true)
                                placeholder(android.R.drawable.ic_menu_gallery)
                                error(android.R.drawable.ic_menu_report_image)
                            }
                        ),
                        contentDescription = book.name,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(160.dp)
                            .clip(RoundedCornerShape(12.dp)),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = book.name ?: "",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )

                    Text(
                        text = book.author ?: "",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                }
            }
        }
    }
}