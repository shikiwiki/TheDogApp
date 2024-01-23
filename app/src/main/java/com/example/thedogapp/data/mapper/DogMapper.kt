package com.example.thedogapp.data.mapper

import com.example.thedogapp.data.remote.DogDto
import com.example.thedogapp.domain.model.Dog

fun DogDto.toDog(): Dog {
    return Dog(
        id = id,
        name = name ?: "",
        imageUrl = imageUrl ?: "",
        description = description ?: ""
    )
}