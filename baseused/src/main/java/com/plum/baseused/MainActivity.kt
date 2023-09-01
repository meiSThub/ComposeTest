package com.plum.baseused

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.plum.baseused.route.MyAppNavHost
import com.plum.baseused.ui.theme.ColorF1F7FF
import com.plum.baseused.ui.theme.ComposeTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = ColorF1F7FF
                ) {
                    ComposeNavigation()
                }
            }
        }
    }
}

@Preview
@Composable
fun ComposeNavigation() {
    MyAppNavHost()
}