package com.kisaan.tubewell.data.local.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tubewell")
data class Tubewell(
    @PrimaryKey
    val tubewellId: Long,
    val name: String,
    val villageId: Long,
    val gramsabhaId: Long,
    val operatorName: String,
    val operatorId: Long,
    val operatorPhone: String,
    val ratePerHour: Int,
    @Embedded(prefix = "location_")
    val location: Location,
    val isActive: Boolean,
    val createdAt: String,
)
