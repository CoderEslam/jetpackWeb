package com.doubleclick.common

import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }
    val platformName = getPlatformName()
    var n by remember { mutableStateOf(0) }
    Button(onClick = {

        text = "Hello, ${platformName} ${n++}"
    }) {
        Text(text)
    }
}
