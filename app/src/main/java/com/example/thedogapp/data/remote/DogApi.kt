package com.example.thedogapp.data.remote

import retrofit2.http.GET

interface DogApi {
    @GET("https://api.thedogapi.com/v1/breeds?limit=10&page=0")
    fun getData(): List<DogDto>
}