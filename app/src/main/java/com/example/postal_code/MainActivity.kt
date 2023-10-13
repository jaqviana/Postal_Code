package com.example.postal_code

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.postal_code.ui.theme.Postal_CodeTheme
import com.example.postal_code.view.FindPostalCode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
           // Postal_CodeTheme {

                val navController: NavHostController = rememberNavController()
                

                NavHost(
                    navController = navController,
                    startDestination = "find_PostalCode"
                ){
                    composable("find_PostalCode"){
                        FindPostalCode(navController)

                    }
                }
           // }
        }
    }
}

