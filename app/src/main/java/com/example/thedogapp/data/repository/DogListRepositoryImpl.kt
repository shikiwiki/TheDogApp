package com.example.thedogapp.data.repository

import com.example.thedogapp.data.mapper.toDog
import com.example.thedogapp.data.remote.DogApi
import com.example.thedogapp.domain.model.Dog
import com.example.thedogapp.domain.repository.DogListRepository
import javax.inject.Inject

class DogListRepositoryImpl
//@Inject
constructor(
    private val dogApi: DogApi,
//    private val dogDatabase: DogDatabase
) :
    DogListRepository {
    override suspend fun getDogList(): List<Dog> {
//        return dogApi.getData().map { it.toDog() }
        return emptyList()  //stub to be compiled
    }
}