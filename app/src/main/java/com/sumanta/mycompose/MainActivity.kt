package com.sumanta.mycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.sumanta.mycompose.ui.theme.MYComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MYComposeTheme {
                App()
            }
        }
    }
}

@Composable
fun App(){
    Scaffold (
        topBar = {
            TopAppBar (
                title = {
                    Text(text = "Demo App")
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Menu, contentDescription ="menu" )
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Notifications, contentDescription ="notifications" )
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Search, contentDescription ="search" )
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                IconButton(onClick = {}) {
                    Icon(Icons.Filled.Add, tint = Color.White, contentDescription ="add" )
                }
            }
        }
    ){
        Greeting(name = "Android")

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MYComposeTheme {
        Greeting("Android")
    }
}