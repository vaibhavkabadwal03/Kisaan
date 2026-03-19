package com.kisaan.tubewell.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usage")
data class Usage(
    @PrimaryKey
    val usageId: Long,
    val farmerId: Long,
    val tubewellId: Long,
    val isBorrowed: Boolean,
    val borrowedFrom: List<Long> = emptyList(), // List of farmer IDs
    val startDateTime: String,
    val endDateTime: String,
    val durationMinutes: Int,
    val amount: Int,
    val createdAt: String
)
