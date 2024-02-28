package com.example.businesscard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                    color = Color(0xFFD2E8D4),
                    modifier = Modifier.fillMaxSize()

                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            Modifier
                .fillMaxHeight(0.2f)
                .background(Color(0xFF073042))

            )
        Text(
            text = stringResource(R.string.name),
            fontSize = 45.sp,
            color = Color.Black,
        )
        Text(
            text = stringResource(R.string.developer),
            fontSize = 35.sp,
            color = Color(0xFF006A34)
        )
        Spacer(
            modifier = Modifier.padding(bottom = 100.dp)
        )
        ContactRow(
            text = stringResource(R.string.phone),
            icon = Icons.Rounded.Phone
        )
        ContactRow(
            text = stringResource(R.string.telegram),
            icon = Icons.Rounded.Share
        )
        ContactRow(
            text = stringResource(R.string.email),
            icon = Icons.Rounded.Email
        )
    }
}

@Composable
fun ContactRow(
    text: String, icon: ImageVector
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(20.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF006D3B),
            modifier = Modifier.weight(1f)
        )
        Text(
            text = text,
            color = Color.Black,
            fontSize = 20.sp,
            modifier = Modifier.weight(3f)


        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(), color = Color(0xFFD2E8D4)
    ) {
        BusinessCardTheme {
            BusinessCard()
        }
    }
}