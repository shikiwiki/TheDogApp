package com.example.thedogapp.data.remote

import com.example.thedogapp.data.util.Constants.Companion.API_KEY
import com.example.thedogapp.data.util.Constants.Companion.HAS_BREEDS
import com.example.thedogapp.data.util.Constants.Companion.LIMIT
import com.example.thedogapp.domain.model.TheDogResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/*
Random dog:
https://api.thedogapi.com/v1/images/search?api_key=live_78uH11IyabCdKAj68Sf1exNbi2vyrC2zBBnl0D2m3gWvbYjMjemv4WTZbMWd8e43

10 random dogs
https://api.thedogapi.com/v1/images/search?limit=10&api_key=live_78uH11IyabCdKAj68Sf1exNbi2vyrC2zBBnl0D2m3gWvbYjMjemv4WTZbMWd8e43
 */

interface DogApi {
    @GET("breeds")
    suspend fun getData(
        @Query("limit")
        limit: String = LIMIT,
        @Query("has_breeds")
        hasBreeds: String = HAS_BREEDS,
        @Query("api_key")
        apiKey: String = API_KEY
    ): Response<TheDogResponse>
}