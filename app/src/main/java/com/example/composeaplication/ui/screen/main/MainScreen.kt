package com.example.composeaplication.ui.screen.main

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeaplication.R
import com.example.composeaplication.ui.theme.ComposeAplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallTopAppBarExample() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Blue,
                    titleContentColor = Color.White,
                ),
                title = {
                    Text("Small Top App Bar")
                },
                navigationIcon = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            tint = Color.White,
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description",
                        )
                    }
                },
                actions = {
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
                }
            )
        },
    ) {
        it.calculateTopPadding()
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    ComposeAplicationTheme {
        SmallTopAppBarExample()
    }
}