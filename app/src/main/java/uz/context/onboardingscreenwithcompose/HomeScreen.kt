package uz.context.onboardingscreenwithcompose

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
   Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
       Column(
           modifier = Modifier.fillMaxWidth(),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally
       ) {
           Image(imageVector = Icons.Filled.Home, contentDescription = "Home",
               colorFilter = ColorFilter.tint(
                   Color.Green
               ),
               modifier = Modifier.size(150.dp)
           )
           Spacer(modifier = Modifier.height(10.dp))
           Text(
               text = "Home",
               fontSize = MaterialTheme.typography.h4.fontSize
           )
       }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}