package com.example.secretdiary.feature.spash

import androidx.compose.animation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.secretdiary.R
import com.example.secretdiary.ui.theme.mySoulFont
import kotlinx.coroutines.delay


@Composable
fun SplashScreenContent() {

    val density = LocalDensity.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        AnimatedVisibility(
            visible = true,
            enter = slideInVertically {
                // Slide in from 40 dp from the top.
                with(density) { 40.dp.roundToPx() }
            } + expandVertically(
                // Expand from the top.
                expandFrom = Alignment.Top
            ) + fadeIn(
                // Fade in with the initial alpha of 0.3f.
                initialAlpha = 0.3f
            ),
            exit = slideOutVertically() + shrinkVertically() + fadeOut()
        ) {
            Text(
                text = stringResource(id = R.string.app_name),
                fontSize = 64.sp,
                fontFamily = mySoulFont,

                )
        }
    }
}

@Composable
fun AnimationSplashScreen(navController: NavHostController) {

    LaunchedEffect(key1 = true) {
        delay(3000)

        // TODO: 로그인이 되어있을 시 main 화면으로 아닐 시 login 화면으로 이동 
    }
    SplashScreenContent()
}


@Composable
@Preview(showBackground = true)
fun SplashScreenPreview() {
    SplashScreenContent()
}
