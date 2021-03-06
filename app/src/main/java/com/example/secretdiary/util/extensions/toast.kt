package com.example.secretdiary.util

import android.content.Context
import android.widget.Toast

/**
 * 편하게 [Toast] 를 만들 수 있게 재공하는 확장 함수
 */


fun Context.toast(
    message: String,
    length: Int = Toast.LENGTH_SHORT,
): Toast = toastBuilder(
    context = this,
    message = message,
    length = length
)

fun toast(
    context: Context,
    messageBuilder: Context.() -> String,
    length: Int = Toast.LENGTH_SHORT,
) = toastBuilder(
    context = context,
    message = messageBuilder(context),
    length = length
)



/**
 * [Toast] 를 반환하기 위해 [also] 로 [show][Toast.show] 진행
 *
 * @return [Toast] 생성된 토스트 객체
 */
private fun toastBuilder(
    context: Context,
    message: String,
    length: Int,
) = Toast.makeText(context, message, length).also { it.show() }