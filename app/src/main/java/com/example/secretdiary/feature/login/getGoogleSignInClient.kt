package com.example.secretdiary.feature.login

import android.content.Context
import com.example.secretdiary.R
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

fun getGoogleSignInClient(context: Context): GoogleSignInClient {
    val signInOptions = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
        .requestIdToken(context.getString(R.string.web_cilent_id ))
        .requestEmail()
        .build()

    return GoogleSignIn.getClient(context, signInOptions)
}