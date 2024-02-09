package com.example.composeaplication.ui.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeaplication.ui.screen.main.Categorias
import com.example.composeaplication.ui.screen.main.SmallTopAppBarExample
import com.example.composeaplication.ui.screen.ui.theme.ComposeAplicationTheme

class ListScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        SmallTopAppBarExample()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeAplicationTheme {
        Greeting()
    }
}