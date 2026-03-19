package com.kisaan.tubewell.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "complaint")
data class Complaint(
    @PrimaryKey
    val complaintId: Long,
    val farmerId: Long,
    val tubewellId: Long,
    val description: String,
    val complaint: String,
    val pictureURL: String,
    val status: String,
    val createdAt: String

)
