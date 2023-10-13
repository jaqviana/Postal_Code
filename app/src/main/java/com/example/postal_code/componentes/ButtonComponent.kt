package com.example.postal_code.componentes

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.postal_code.ui.theme.RedStrong
import com.example.postal_code.ui.theme.White

@Composable
fun ButtonComponent(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier
){
   Button(
        onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = RedStrong
        ),
       modifier = modifier,
    ){
        Text(text = text,
            fontSize = 18.sp,
            color = White)
    }

}

