package com.kisaan.tubewell.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "village")
data class Village(
    @PrimaryKey
    val villageId: Long,
    val name: String,
    val block: String,
    val gramsabhaId: Long
)
