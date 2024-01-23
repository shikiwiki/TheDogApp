package com.example.thedogapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.thedogapp.domain.repository.DogListRepository
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@OptIn(DelicateCoroutinesApi::class)
class TheDogViewModel @Inject constructor(private val dogListRepository: DogListRepository) :
    ViewModel() {
    init {
        viewModelScope.launch {
            dogListRepository.getDogList()
        }
    }
}