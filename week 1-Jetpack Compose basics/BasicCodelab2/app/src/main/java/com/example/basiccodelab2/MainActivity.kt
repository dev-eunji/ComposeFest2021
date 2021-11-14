package com.example.basiccodelab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiccodelab2.ui.theme.BasicCodelab2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicCodelab2Theme { // depends on how your project is named.
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

/**
 * composable function is a regular function annotated with @Composable
 * This function will produce a piece of UI
 */
@Composable
fun Greeting(name: String) {
    /**
     * Surface()
     * - set a different background color with 
     * - Material components chooses an appropriate color for text.
     *   : 흰 배경에서는 검정색 글씨가 Surcface color를 보라색으로 지정했더니 글자색이 하얀색으로 자동 변경됨
     */
    Surface(color = MaterialTheme.colors.primary) {
        Text(text = "Hello $name!", modifier = Modifier.padding(24.dp)) // Text() is a composable function
    }
}

@Preview(showBackground = true, name = "Text preview")
@Composable
fun DefaultPreview() {
    BasicCodelab2Theme {
        Greeting("Android")
    }
}