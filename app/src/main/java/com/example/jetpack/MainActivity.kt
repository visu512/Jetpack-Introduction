package com.example.jetpack

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberBottomAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack.ui.theme.JetpackTheme

// build toolbar
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTheme {
                Scaffold(
                    topBar = {  // top bar
                        TopAppBar(
                            title = {
                                Text("First app") // app name
                            },
                            navigationIcon = {
                                IconButton(onClick = { }) {
                                    // menu button
                                    Icon(Icons.Filled.Menu, contentDescription = "menu")
                                }
                            },
                            // notifications icon
                            actions = {
                                IconButton(onClick = { }) {
                                    // notification button
                                    Icon(
                                        Icons.Filled.Notifications,
                                        contentDescription = "notifications"
                                    )
                                }
                                // search button
                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Search, contentDescription = "search")
                                }
                                // setting button
                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Settings, contentDescription = "settings")
                                }
                            }
                        )
                    },
                    /// floating button
                    floatingActionButton = {
                        FloatingActionButton(onClick = { }) {
                            IconButton(onClick = { }) {
                                Icon(Icons.Filled.Add, contentDescription = "add")
                            }
                        }
                    },
                    /// button bar
                    bottomBar = {
                        BottomAppBar{
                            IconButton(onClick = { }) {
                                Icon(Icons.Filled.Home, contentDescription ="Home" )
                            }
                            IconButton(onClick = { }) {
                                Icon(Icons.Filled.AccountCircle, contentDescription ="user" )
                            }
                            IconButton(onClick = { }) {
                                Icon(Icons.Filled.Add, contentDescription ="add" )
                            }
                            IconButton(onClick = { }) {
                                Icon(Icons.Filled.FavoriteBorder, contentDescription ="user" )
                            }
                            IconButton(onClick = { }) {
                                Icon(Icons.Filled.Settings, contentDescription ="add" )
                            }
                            IconButton(onClick = { }) {
                                Icon(Icons.Filled.ShoppingCart, contentDescription ="user" )
                            }
                            IconButton(onClick = { }) {
                                Icon(Icons.Filled.ThumbUp, contentDescription ="add" )
                            }

                        }
                    }
                ) {
                    // Content goes here
                    Greeting(name = "Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        fontSize = 30.sp,
        color = Color.Gray,
        modifier = modifier.padding(top = 80.dp, start = 12.dp)
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackTheme {
        Greeting("Android")
    }
}