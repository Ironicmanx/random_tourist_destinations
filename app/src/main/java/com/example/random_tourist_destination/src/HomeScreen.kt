package com.example.random_tourist_destination.src

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.compose.runtime.livedata.observeAsState


@Composable
fun HomeScreen(navController: NavController, viewModel: DestinationViewModel = viewModel()) {
    val selectedDestination by viewModel.selectedDestination.observeAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Display Randomly Picked Destination
        selectedDestination?.let { destination ->
            Text(
                text = "Your Next Trip: ${destination.name}",
                fontSize = 24.sp,
                style = MaterialTheme.typography.headlineMedium
            )
            Text(
                text = "Country: ${destination.country}",
                fontSize = 18.sp,
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = "Description: ${destination.description}",
                fontSize = 16.sp,
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "Best time to visit: ${destination.bestTimeToVisit}",
                fontSize = 16.sp,
                style = MaterialTheme.typography.bodyMedium
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Button to Pick a Random Destination
        Button(onClick = { viewModel.pickRandomDestination() }) {
            Text("Pick a Destination")
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Button to navigate to Info Screen
        Button(onClick = { navController.navigate("info") }) {
            Text("Info")
        }
    }
}
