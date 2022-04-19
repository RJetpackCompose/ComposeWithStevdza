package me.ruyeo.composewithstevdza.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter

@OptIn(ExperimentalCoilApi::class)
@Composable
fun CoilImageLoader(){
    Box(
        modifier = Modifier
            .height(150.dp)
            .width(150.dp)
    ) {
        val painter = rememberImagePainter(data = "https://itc.ua/wp-content/uploads/2020/04/android_logo_stacked__rgb_.5.jpg",
            builder = {

            })
        val painterState = painter.state
        Image(painter = painter, contentDescription = "Coil Image")
        if (painterState is ImagePainter.State.Loading){
            CircularProgressIndicator()
        }

    }
}