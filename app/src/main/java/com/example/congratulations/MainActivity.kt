package com.example.congratulations

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.congratulations.ui.CongratulationsTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CongratulationsTheme {
                Screen()
            }
        }
    }
}

@Composable
fun Screen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(R.string.app_name),
                        color = MaterialTheme.colors.onPrimary
                    )
                }
            )
        }
    ) {
        Content()
    }
}

@Composable
fun Content() {
    Image(
        bitmap = ImageBitmap.imageResource(id = R.drawable.androidparty),
        contentScale = ContentScale.Crop,
        contentDescription = null,
        modifier = Modifier.fillMaxSize()
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