package com.example.secretdiary.feature.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.secretdiary.R
import com.example.secretdiary.ui.theme.loginBtnColor
import com.example.secretdiary.ui.theme.mySoulFont

@Composable
fun LoginScreen(navController: NavController) {

    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()

    ) {
        LoginTitle()
        Spacer(modifier = Modifier.padding(70.dp))
        GoogleLoginButton(
            onclick = {}
        )
    }
}


@Composable
fun LoginTitle() {


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.CenterVertically)
            .padding(start = 48.dp, end = 48.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            fontSize = 64.sp,
            fontFamily = mySoulFont,

            )
    }
}

@Composable
fun GoogleLoginButton(onclick: () -> Unit) {

    Box(
        modifier = Modifier
            .padding(30.dp)
            .fillMaxWidth()
            .background(loginBtnColor)
            .height(50.dp)
            .clickable { onclick() }
    ) {


        Row {
            GoogleImageView()
            Text(
                text = "LOG IN WITH GOOGLE",
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

@Preview
@Composable
fun GoogleLoginButtonPreview() {
    GoogleLoginButton {}
}

@Preview
@Composable
fun LoginPreview() {

    LoginScreen(rememberNavController())
}
