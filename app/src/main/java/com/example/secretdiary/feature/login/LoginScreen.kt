package com.example.secretdiary.feature.login

import android.content.Context
import android.util.Log
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.secretdiary.R
import com.example.secretdiary.feature.AppTitle
import com.example.secretdiary.util.toast
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider

@Composable
fun LoginScreen(navController: NavController) {

    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()

    ) {
        AppTitle()
        Spacer(modifier = Modifier.padding(30.dp))

        Login(navController)
    }
}

@Composable
fun Login(
    navController: NavController,
) {
    val coroutineScope = rememberCoroutineScope()
    var text by remember { mutableStateOf<String?>(null) }
//    val user by remember(authViewModel) { authViewModel.user }.collectAsState()
    val context = LocalContext.current

    val signInRequestCode = 1

    val authResultLauncher =
        rememberLauncherForActivityResult(contract = AuthResultContract()) { task ->

            try {
                val account = task?.getResult(ApiException::class.java)
                if (account == null) {
                    text = "Google sign in failed"
                    Log.d("TAG", "Login: ${account}")
                } else {
                    firebaseAuthWithGoogle(
                        context = context,
                        account.idToken.toString(),
                        navController = navController
                    )

                }
            } catch (e: ApiException) {
                Log.d("TAG", "Login catch: ${e.message}")
                text = "Google sign in failed"
            }
        }

    AuthView(
        errorText = text,
        onClick = {
            text = null
            authResultLauncher.launch(signInRequestCode)
        }
    )


}

@Composable
fun AuthView(
    errorText: String?,
    onClick: () -> Unit
) {
    var isLoading: Boolean by remember { mutableStateOf(false) }


    GoogleLoginButton(
        isLoading = isLoading,
        onClick = {
            isLoading = true
            onClick()
        }
    )

    errorText?.let {
        isLoading = false
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = it)
    }
}


private fun firebaseAuthWithGoogle(
    context: Context,
    idToken: String,
    navController: NavController
) {
    val auth = FirebaseAuth.getInstance()

    val credential = GoogleAuthProvider.getCredential(idToken, null)
    auth.signInWithCredential(credential)
        .addOnCompleteListener { task ->
            if (task.isSuccessful) {
                // Sign in success, update UI with the signed-in user's information
                context.toast("성공")

            } else {
                // If sign in fails, display a message to the user.
                Log.w("TAG", "signInWithCredential:failure", task.exception)
                context.toast("실패")
            }
        }
}


@Preview
@Composable
fun GoogleLoginButtonPreview() {
    GoogleLoginButton(false, {})
}

@Preview
@Composable
fun LoginPreview() {

    LoginScreen(rememberNavController())
}
