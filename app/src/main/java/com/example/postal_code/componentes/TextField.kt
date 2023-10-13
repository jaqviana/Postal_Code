package com.example.postal_code.componentes

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.postal_code.ui.theme.RedStrong

@Composable
fun TextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier,
    keyboardOptions: KeyboardOptions
) {
    OutlinedTextField(
        value,
        onValueChange,
        label = {
            Text(text = label)

        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = RedStrong,
            cursorColor = RedStrong,
            focusedLabelColor = RedStrong
        ),
        modifier = modifier,
        keyboardOptions = keyboardOptions,
        maxLines = 1
    )
}

