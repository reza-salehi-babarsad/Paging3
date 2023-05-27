package com.example.paging3.data.mappers

import com.example.paging3.data.local.BeerEntity
import com.example.paging3.data.remote.BeerDto
import com.example.paging3.domain.Beer

fun BeerDto.toBeerEntity():BeerEntity{
    return BeerEntity(
        id=id,
        name = name,
        description =description,
        tagline=tagline,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}
fun BeerEntity.toBeer():Beer{
    return Beer(
        id=id,
        name=name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}