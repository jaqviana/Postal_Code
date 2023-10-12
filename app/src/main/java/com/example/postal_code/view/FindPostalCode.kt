package com.example.postal_code.view

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.postal_code.ui.theme.RedStrong
import com.example.postal_code.ui.theme.White


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FindPostalCode(navController: NavController){
    Scaffold (
        topBar = {
            TopAppBar (
                title = {
                    Text(text = "Postal Code", fontSize = 18.sp)
                },
                contentColor = White,
                backgroundColor = RedStrong
            )

        }
    ){
    }

}

@Preview
@Composable
private fun FindPostalCodePreview(){
    FindPostalCode(navController = rememberNavController())
}