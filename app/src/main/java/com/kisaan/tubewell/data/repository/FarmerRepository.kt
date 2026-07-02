package com.kisaan.tubewell.data.repository

import com.kisaan.tubewell.data.local.entity.Farmer
import kotlinx.coroutines.flow.Flow

interface FarmerRepository {
    suspend fun insertFarmer(farmer: Farmer)
    fun getAllFarmers(): Flow<List<Farmer>>
    fun getFarmerById(farmerId: Long): Flow<Farmer?>
}