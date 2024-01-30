package com.example.composeaplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
fun LoginScreen(
){
    var user by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    var isChecked by remember {
        mutableStateOf(false)
    }


    Column(
        Modifier
            .background(color = Color.Cyan)
            .fillMaxSize()
    ) {

        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Logo do app",
            Modifier
                .size(200.dp)
                .align(Alignment.CenterHorizontally)
                .padding(8.dp)
        )

        OutlinedTextField(
            value = user,
            onValueChange = { user = it },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_account_circle_24),
                    contentDescription = "icone de conta",
                    Modifier
                        .padding(8.dp)
                        .background(color = Color.White)
                )
            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(8.dp)
                .background(color = Color.White)
                .fillMaxWidth()
        )

        OutlinedTextField(value = "Password", onValueChange = {password},
            Modifier
                .align(Alignment.CenterHorizontally)
                .padding(8.dp)
                .background(color = Color.White)
                .fillMaxWidth()
            )

        Row(){

            Checkbox(checked = isChecked, onCheckedChange = {
                isChecked = it
            }, Modifier
                .padding(4.dp)
                )

            Text(text = "Manter logado", Modifier.align(Alignment.CenterVertically))
        }

        Button(onClick = { /*TODO*/ },
            Modifier
                .fillMaxWidth()
                .padding(8.dp) ) {

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