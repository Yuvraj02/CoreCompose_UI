package com.example.corecomposeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.corecomposeui.ui.theme.CoreComposeUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    androidx.compose.material.Surface(color = Color.DarkGray, modifier = Modifier.fillMaxSize()) {

        Column(modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {
            VerticalColorBar(color = Color(0xFFF06429))
            VerticalColorBar(color = Color.White)
            VerticalColorBar(color = Color(0xFF207314))

            Row (modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly,verticalAlignment = Alignment.CenterVertically){
                HorizontalColorBar(Color.Blue)
                HorizontalColorBar(Color.White)
                HorizontalColorBar(Color.Red)
            }
       }
    }
}

@Composable
fun VerticalColorBar(color: Color) {
    androidx.compose.material.Surface(
        modifier = Modifier
            .width(300.dp)
            .height(60.dp),
        color = color
    ) {
        /*TODO*/
    }
}

@Composable
fun HorizontalColorBar(color: Color) {
    androidx.compose.material.Surface(
        color = color,
        modifier = Modifier
            .height(300.dp)
            .width(60.dp)
    ) {
        //Text(text = "First Surface",style = MaterialTheme.typography.h4)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}