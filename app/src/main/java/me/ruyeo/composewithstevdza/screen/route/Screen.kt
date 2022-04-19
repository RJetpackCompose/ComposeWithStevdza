package me.ruyeo.composewithstevdza.screen.route

sealed class Screen(var route: String) {
    object Home: Screen("home_screen")
    object Detail: Screen("detail_screen")
    object Spash: Screen("splash_screen")
}