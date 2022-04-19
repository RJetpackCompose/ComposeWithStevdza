package me.ruyeo.composewithstevdza

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import me.ruyeo.composewithstevdza.navgraph.SetupNavGraph
import me.ruyeo.composewithstevdza.screen.MainScreen
import me.ruyeo.composewithstevdza.ui.theme.ComposeWithStevdzaTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeWithStevdzaTheme {
               // MainScreen()
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeWithStevdzaTheme {
    }
}