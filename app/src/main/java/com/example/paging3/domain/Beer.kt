package com.example.paging3.domain

data class Beer(
    val id: Int,
    val name:String,
    val description:String,
    val tagline:String,
    val firstBrewed:String,
    val imageUrl:String?
)
