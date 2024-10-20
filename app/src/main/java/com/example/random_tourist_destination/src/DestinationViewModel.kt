package com.example.random_tourist_destination.src

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class DestinationViewModel : ViewModel() {

    private val destinations = listOf(
        Destination("Rome", "Italy", "The Eternal City", "April to June"),
        Destination("Paris", "France", "City of Lights", "September to November"),
        Destination("Tokyo", "Japan", "A city of contrasts", "March to May"),
        Destination("New York", "USA", "The Big Apple", "April to June"),
        Destination("Sydney", "Australia", "Harbour City", "September to November"),
        Destination("Rio de Janeiro", "Brazil", "City of Samba", "December to March"),
        Destination("Cape Town", "South Africa", "Mother City", "November to February"),
        Destination("Dubai", "UAE", "City of Gold", "November to March"),
        Destination("Barcelona", "Spain", "City of Gaudí", "April to June"),
        Destination("Istanbul", "Turkey", "City on Two Continents", "September to November"),
        Destination("Bangkok", "Thailand", "City of Angels", "November to February"),
        Destination("Singapore", "Singapore", "Lion City", "December to June"),
        Destination("London", "UK", "Capital of England", "March to May"),
        Destination("Moscow", "Russia", "Capital of Russia", "May to September"),
        Destination("Berlin", "Germany", "Capital of Germany", "May to September"),
        Destination("Toronto", "Canada", "City of Neighborhoods", "June to September"),
        Destination("Cairo", "Egypt", "The City of a Thousand Minarets", "October to April"),
        Destination("Lisbon", "Portugal", "The City of Seven Hills", "March to May"),
        Destination("Buenos Aires", "Argentina", "Paris of South America", "March to May"),
        Destination("Mumbai", "India", "City of Dreams", "November to February"),
        Destination("Hanoi", "Vietnam", "The City of Lakes", "September to November"),
        Destination("Amsterdam", "Netherlands", "Venice of the North", "April to October"),
        Destination("Mexico City", "Mexico", "The City of Palaces", "March to May"),
        Destination("Kuala Lumpur", "Malaysia", "Capital City", "May to July"),
        Destination("Vienna", "Austria", "City of Music", "April to June"),
        Destination("Seattle", "USA", "Emerald City", "June to August"),
        Destination("Helsinki", "Finland", "The Daughter of the Baltic", "May to August")
    )

    private val _selectedDestination = MutableLiveData<Destination?>()
    val selectedDestination: LiveData<Destination?> = _selectedDestination

    fun pickRandomDestination() {
        _selectedDestination.value = destinations[Random.nextInt(destinations.size)]
    }
}
