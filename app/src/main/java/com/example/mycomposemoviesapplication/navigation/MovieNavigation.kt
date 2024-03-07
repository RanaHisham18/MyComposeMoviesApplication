package com.example.mycomposemoviesapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MovieNav(){
    val navController = rememberNavController()
NavHost(navController = navController,
    startDestination = ApplicationScreens.HOME.name){
    //Here is the Nav builder
  composable(ApplicationScreens.HOME.name){
//we should pass the actual composable
      ApplicationScreens.HOME.name()
  }
}
}