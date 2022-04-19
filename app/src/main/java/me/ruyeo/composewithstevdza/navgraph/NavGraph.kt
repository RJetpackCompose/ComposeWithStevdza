package me.ruyeo.composewithstevdza.navgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import me.ruyeo.composewithstevdza.screen.AnimatedSplashScreen
import me.ruyeo.composewithstevdza.screen.DetailScreen
import me.ruyeo.composewithstevdza.screen.HomeScreen
import me.ruyeo.composewithstevdza.screen.Splash
import me.ruyeo.composewithstevdza.screen.route.Screen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Spash.route
    ){
        composable(Screen.Home.route){
            HomeScreen(navController = navController)
        }

        composable(Screen.Spash.route){
            AnimatedSplashScreen(navController = navController)
        }
    }
}