package com.kisaan.tubewell.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "borrow")
data class Borrow(
    @PrimaryKey
    val borrowId: Long,
    val usageId: Long,
    val fromFarmerId: Long,
    val toFarmerId: Long,
    val tubewellId: Long,
    val minutes: Int,
    val createdAt: String
)
