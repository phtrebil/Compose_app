package com.example.composeaplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeaplication.ui.theme.ComposeAplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(){
    var user by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    var isChecked by remember {
        mutableStateOf(false)
    }


    Column() {
        OutlinedTextField(value = "User", onValueChange = {user} )
        OutlinedTextField(value = "Password", onValueChange = {password} )
        Row(){
            Checkbox(checked = isChecked, onCheckedChange = {
                isChecked = it
            })
            Text(text = "Manter logado")
        }
        Button(onClick = { /*TODO*/ } ) {
            Text(text = "Logar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    ComposeAplicationTheme {
        LoginScreen()
    }
}