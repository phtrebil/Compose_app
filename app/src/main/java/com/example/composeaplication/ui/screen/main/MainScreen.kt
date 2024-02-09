package com.example.composeaplication.ui.screen.main

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeaplication.R
import com.example.composeaplication.ui.theme.ComposeAplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallTopAppBarExample() {
    Column {
        Scaffold(
            topBar = {
                TopAppBar(colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Blue,
                    titleContentColor = Color.White,
                ), title = {
                    Text("Small Top App Bar")
                }, navigationIcon = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            tint = Color.White,
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description",
                        )
                    }
                }, actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            tint = Color.White,
                            imageVector = Icons.Filled.Search,
                            contentDescription = "Search icon"
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            tint = Color.White,
                            painter = painterResource(id = R.drawable.baseline_filter_alt_24),
                            contentDescription = "Search icon"
                        )
                    }
                })
                Categorias()
            },
        ) {
            it.calculateBottomPadding()
        }

    }

}

@Composable
fun Categorias() {
    Row(
        Modifier
            .background(color = Color.Blue)
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
    ) {
        Text(text = "Categoria 1", color = Color.White)
        Text(text = "Categoria 2", color = Color.White)
        Text(text = "Categoria 3", color = Color.White)
        Text(text = "Categoria 4", color = Color.White)
        Text(text = "Categoria 5", color = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    ComposeAplicationTheme {

    }
}