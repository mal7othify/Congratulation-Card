package com.example.congratulations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.congratulations.ui.CongratulationsTheme
import com.example.congratulations.ui.typography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CongratulationsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Screen()
                }
            }
        }
    }
}

@Composable
fun Screen() {
    Scaffold(
        topBar = {
            TopAppBar {
                Text(
                    text = stringResource(id = R.string.app_name),
                    style = typography.h1,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
        }
    ) {
        Content()
    }
}

@Composable
fun Content() {
    Image(
        bitmap = imageResource(id = R.drawable.androidparty),
        contentScale = ContentScale.Crop
    )
    Box(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Text(
            text = "Congrats!",
            modifier = Modifier.align(Alignment.TopStart)
        )
        Text(
            text = "From Maryam",
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CongratulationsTheme {
        Screen()
    }
}