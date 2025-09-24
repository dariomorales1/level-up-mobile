package cl.duoc.level_up_mobile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import cl.duoc.level_up_mobile.R
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@OptIn (ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen () {

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Mi primera aplicación") })
        }
    ) { innerPadding ->
        Column (
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Text(text = "Bienvenido")
            Button(onClick = {/* Todo */}) {
                Text(text = "Presioname")
            }
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "LogoDuoc",
                modifier = Modifier.fillMaxWidth()
                    .height(150.dp),
                    contentScale = ContentScale.Fit)

        }
    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview () {
    HomeScreen()
}
