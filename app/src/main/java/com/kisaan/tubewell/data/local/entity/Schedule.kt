package com.kisaan.tubewell.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "schedule")
data class Schedule(
    @PrimaryKey
    val slotId: Long,
    val farmerId: Long,
    val tubewellId: Long,
    val startDay: String,
    val startTime: String,
    val endDay: String,
    val endTime: String,
    val startWeekIndex: Int,
    val endWeekIndex: Int,
    val turnDurationMinutes: Int,
    val createdAt: String
)
