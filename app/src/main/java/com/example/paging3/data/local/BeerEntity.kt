package com.example.paging3.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "beerentity")
data class BeerEntity(
    @PrimaryKey
    val id: Int,
    val name:String,
    val description:String,
    val tagline:String,
    val firstBrewed:String,
    val imageUrl:String?
    )
