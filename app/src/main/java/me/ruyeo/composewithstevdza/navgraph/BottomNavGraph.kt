package me.ruyeo.composewithstevdza.navgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import me.ruyeo.composewithstevdza.screen.DetailScreen
import me.ruyeo.composewithstevdza.screen.HomeScreen
import me.ruyeo.composewithstevdza.screen.SettingScreen
import me.ruyeo.composewithstevdza.screen.route.BottomBarScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(route = BottomBarScreen.Home.route){
            HomeScreen(navController = navController)
        }
        composable(route = BottomBarScreen.Profile.route){
            DetailScreen(navController = navController)
        }
        composable(route = BottomBarScreen.Settings.route){
            SettingScreen(navController = navController)
        }
    }
}