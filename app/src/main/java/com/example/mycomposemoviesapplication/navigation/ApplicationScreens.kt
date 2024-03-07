package com.example.mycomposemoviesapplication.navigation

enum class ApplicationScreens{
    HOME,
    DETAILS;

    companion object{
        fun fromRoute(route:String?) : ApplicationScreens
        = when(route?.substringBefore("/")){
            HOME.name -> HOME
            DETAILS.name -> DETAILS
            null -> HOME
            else -> throw IllegalArgumentException("Route $route is not recognised")
        }
    }

}