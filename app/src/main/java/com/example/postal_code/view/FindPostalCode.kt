package com.example.postal_code.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.postal_code.componentes.ButtonComponent
import com.example.postal_code.componentes.TextField
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

        var inputCode by remember {
            mutableStateOf("")
        }

        var inputAddress by remember {
            mutableStateOf("")
        }

        var inputCity by remember {
            mutableStateOf("")
        }

        var inputProvince by remember {
            mutableStateOf("")
        }

        var inputCountry by remember {
            mutableStateOf("")
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Row (
                modifier = Modifier.fillMaxWidth()
            ){
                TextField(
                    value = inputCode ,
                    onValueChange = {
                        inputCode = it
                    },
                    label = "Postal Code" ,
                    modifier = Modifier
                        .width(200.dp)
                        .padding(20.dp, 50.dp, 20.dp, 10.dp) ,
                    keyboardOptions = KeyboardOptions(
                       keyboardType = KeyboardType.Number
                    )
                )
                ButtonComponent(
                    onClick = {

                    },
                    text = "Find" ,
                    modifier = Modifier
                        .padding(0.dp, 59.dp, 20.dp, 10.dp)
                        .height(55.dp)
                        .width(180.dp)
                )
            }

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {

                TextField(
                    value = inputAddress ,
                    onValueChange = {
                        inputAddress = it
                    },
                    label = "Address" ,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp, 20.dp, 10.dp) ,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    )
                )
                TextField(
                    value = inputCity ,
                    onValueChange = {
                        inputCity = it
                    },
                    label = "City" ,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp, 20.dp, 10.dp) ,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    )
                )
                TextField(
                    value = inputProvince,
                    onValueChange = {
                        inputProvince = it
                    },
                    label = "Province" ,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp, 20.dp, 10.dp) ,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    )
                )
                TextField(
                    value = inputCountry,
                    onValueChange = {
                        inputCountry = it
                    },
                    label = "Country" ,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp, 20.dp, 10.dp) ,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    )
                )
                ButtonComponent(
                    onClick = {

                    },
                    text = "Next" ,
                    modifier = Modifier
                        .padding(20.dp)
                        .height(55.dp)
                        .width(180.dp)
                )
            }
        }
    }

}
