package com.alejandroarriola.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alejandroarriola.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardTheme {
                        BusinessCard(nombre = stringResource(R.string.nombre), titulo = stringResource(R.string.titulo), email = stringResource(
                            R.string.email
                        ), github = stringResource(
                            R.string.github
                        )
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun BusinessCard(nombre: String, titulo: String, email: String, github: String, modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0xFF6FF3B6)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.dragon),
                contentDescription = null,
                modifier = Modifier
                    .padding(6.dp)
                    .size(200.dp)
                    .align(Alignment.CenterHorizontally)
               // contentScale = ContentScale.FillWidth,
                //alpha = 0.5F
            )

            Text(
                text = nombre,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(start = 24.dp, end = 24.dp)
            )

            Text(
                text = titulo,
                // fontSize = 12.sp,
             //   modifier = Modifier
                    //.padding(top = 24.dp, bottom = 8.dp)
            )
        }

        Spacer(modifier = Modifier.height(80.dp))

        Column {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.github_icon_2048x2048_eyd5tyuo),
                    contentDescription = null,
                    Modifier.size(16.dp),
                    contentScale = ContentScale.FillWidth,
                    //alpha = 0.5F
                )

                Spacer(modifier = Modifier.width(7.dp))

                Text(
                    text = github,
                    // fontSize = 12.sp,
                    modifier = Modifier
                        //.padding(top = 24.dp, bottom = 8.dp)
                )
            }

            Row {
                Image(
                    painter = painterResource(id = R.drawable.email_png51),
                    contentDescription = null,
                    Modifier.size(16.dp),
                    contentScale = ContentScale.FillWidth,
                    //alpha = 0.5F
                )

                Spacer(modifier = Modifier.width(7.dp))

                Text(
                    text = email,
                    // fontSize = 12.sp,
                    modifier = Modifier
                        //.padding(top = 24.dp, bottom = 8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard(nombre = stringResource(R.string.nombre), titulo = stringResource(R.string.titulo), email = stringResource(
            R.string.email
        ), github = stringResource(
            R.string.github
        )
        )
    }
}