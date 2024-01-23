package com.example.thedogapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.thedogapp.domain.repository.DogListRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class TheDogViewModel @Inject constructor(private val dogListRepository: DogListRepository) :
    ViewModel() {
    init {
        viewModelScope.launch {
            dogListRepository.getDogList()
        }
    }
}