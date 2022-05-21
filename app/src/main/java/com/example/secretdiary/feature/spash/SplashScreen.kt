package com.example.secretdiary.feature.spash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.secretdiary.R
import com.example.secretdiary.ui.theme.mySoulFont


@Composable
fun SplashScreen() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            fontSize = 64.sp,
            fontFamily = mySoulFont

        )
    }
}


@Composable
@Preview(showBackground = true)
fun SplashScreenPreview() {
    SplashScreen()
}