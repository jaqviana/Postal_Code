package com.example.postal_code

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
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
            Postal_CodeTheme {

                val navController: NavHostController = rememberNavController()
                

                NavHost(
                    navController = navController,
                    startDestination = "find_PostalCode"
                ){
                    composable("find_PostalCode"){
                        FindPostalCode(navController)

                    }
                }
            }
        }
    }
}

