package com.example.thedogapp.domain.repository

import com.example.thedogapp.domain.model.Dog

interface DogListRepository {
    suspend fun getDogList() : List<Dog>
}