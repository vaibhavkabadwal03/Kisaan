package com.kisaan.tubewell.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "farmer")
data class Farmer(
    @PrimaryKey(autoGenerate = true)
    val farmerId: Long,
    val name: String,
    val fatherName: String,
    val phone: String,
    val address: String? = null,
    val email: String? = null,
    val pictureUrl: String? = null,
    val gramsabhaId: Long,
    val villageId: Long,
    val tubewellId: Long,
    val role: String,
    val landArea: String? = null,
    val createdAt: String
)