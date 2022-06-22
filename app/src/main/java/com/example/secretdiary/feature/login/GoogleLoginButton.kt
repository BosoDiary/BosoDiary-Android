package com.example.secretdiary.feature.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.secretdiary.R
import com.example.secretdiary.ui.theme.loginBtnColor

@Composable
fun GoogleLoginButton(
    isLoading: Boolean = false,
    onClick: () -> Unit
) {

     Box(
        modifier = Modifier
            .padding(30.dp)
            .fillMaxWidth()
            .background(loginBtnColor)
            .height(50.dp)
            .clickable(
                enabled = !isLoading,
                onClick = onClick

            ),
    ) {


        Row {
            GoogleImageView()
            Text(
                text = if (isLoading) "...isLoading " else "LOG IN WITH GOOGLE",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )

        }

    }

}

@Composable
fun GoogleImageView() {
    Surface(
        modifier = Modifier
            .padding(7.dp)
            .clip(RoundedCornerShape(8.dp))
            .size(36.dp)
            .background(Color.White)

    ) {
        Icon(
            modifier = Modifier
                .fillMaxSize()
                .padding(7.dp),
            painter = painterResource(id = R.drawable.google_img),
            contentDescription = null,
        )
    }
}