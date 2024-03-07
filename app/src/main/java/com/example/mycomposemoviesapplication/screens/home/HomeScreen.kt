package com.example.mycomposemoviesapplication.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mycomposemoviesapplication.MovieRow
import com.example.mycomposemoviesapplication.MyApp

@ExperimentalMaterial3Api
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary,
            ),
            title = {
                Text("My Movie App")
            }
        )
    }) { padding -> Modifier.padding(12.dp)
        //add padding modifier
        MainContent(navController = navController)
    }
}



@Composable
fun MainContent(
    movieList: List<String> = listOf(
        "Tom and Gerry",
        "Donald Duck",
        "Avatar",
        "Iron Man",
        "Harry Potter",
        "Jarvis",
        "In the shadow of the moon",
        "Titanic",
        "Lala Land"
    ), navController: NavController
) {
    MyApp {}
    Column(
        modifier = Modifier
            .padding(25.dp, 100.dp, 25.dp, 25.dp)
            .fillMaxWidth()
    ) {
        LazyColumn {
            items(items = movieList) {
                MovieRow(movie = it)
            }
        }

    }
}