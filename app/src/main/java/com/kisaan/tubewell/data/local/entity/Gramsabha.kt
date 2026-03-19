package com.kisaan.tubewell.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "gramsabha")
data class Gramsabha(
    @PrimaryKey
    val gramsabhaId: Long,
    val name: String,
    val block: String,
    val district: String,
    val state: String,
    val totalVillages: Int,
    val totalTubewells: Int,
    val createdAt: String
)
