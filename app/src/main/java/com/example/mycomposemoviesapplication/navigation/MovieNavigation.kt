@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.mycomposemoviesapplication.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mycomposemoviesapplication.screens.home.HomeScreen

@Composable
fun MovieNav(){
    val navController = rememberNavController()
NavHost(navController = navController,
    startDestination = ApplicationScreens.HOME.name){
    //Here is the Nav builder
  composable(ApplicationScreens.HOME.name){
//we should pass the actual composable
   HomeScreen(navController = navController)
  }
}
}