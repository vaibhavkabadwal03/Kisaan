package com.kisaan.tubewell.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Timestamp

@Entity(tableName = "payment")
data class Payment(
    @PrimaryKey(autoGenerate = true)
    val paymentId: Long,
    val farmerId: String,
    val tubewellId: String,
    val totalAmount: Int,
    val lastPaidAmount: Int,
    val lastPaidDate: Long,
    val paymentMethod: String,
val paymentCollectedVia: String
)
