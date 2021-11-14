package com.example.basiccodelab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
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
                MyApp()
            }
        }
    }
}

@Composable
private fun MyApp(names: List<String> = listOf("World", "Compose")) {

    /**
     * Composable functions can be used like any other function in Kotlin.
     * This makes building UIs really powerful
     * since you can add statements to influence how the UI will be displayed.
     */
    Column(modifier = Modifier.padding(vertical = 4.dp)){
        for (name in names) {
            Greeting(name = name)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {           // children in side of a Column will be placed horizontally
            /**
             * omposable 시작시 weight를 주어 (alignEnd modifier 없음, fillMaxWidth와 중복)
             * - 사용 가능한 모든 공간을 채우고 flexible 하게 만든들고
             * - weight가 없는 다른 inflexible elements 를 밀어냄
             */
            Column(modifier = Modifier.weight(1f)) { // vertically
                Text(text = "Hello, ")
                Text(text = name)
            }
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text("Show more")
            }
        }

    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    BasicCodelab2Theme {
        MyApp()
    }
}