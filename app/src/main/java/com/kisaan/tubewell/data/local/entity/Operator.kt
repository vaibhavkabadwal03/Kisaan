package com.kisaan.tubewell.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "operator")
data class Operator(
    @PrimaryKey
    val operatorId: Long,
    val name: String,
    val fatherName: String,
    val phone: String,
    val createdAt: String,
    val gramsabhaId: Long,
    val villageId: Long,
    val role: String
)
