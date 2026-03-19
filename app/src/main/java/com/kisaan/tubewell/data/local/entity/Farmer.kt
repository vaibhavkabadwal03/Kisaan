package com.kisaan.tubewell.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "farmer")
data class Farmer(
    @PrimaryKey
    val farmerId: Long,
    val name: String,
    val fatherName: String,
    val phone: String,
    val address: String,
    val email: String,
    val pictureUrl: String,
    val gramsabhaId: Long,
    val villageId: Long,
    val tubewellId: Long,
    val role: String,
    val landArea: String,
    val createdAt: String
)