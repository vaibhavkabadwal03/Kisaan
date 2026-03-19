package com.kisaan.tubewell.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.kisaan.tubewell.data.local.entity.Farmer
import kotlinx.coroutines.flow.Flow

@Dao
interface FarmerDao {

    @Insert
    suspend fun insertFarmer(farmer: Farmer)

    @Query("SELECT * FROM farmer ORDER BY name ASC")
    suspend fun getAllFarmers(): Flow<List<Farmer>>

    @Query("SELECT * FROM farmer WHERE farmerId = :farmerId")
    suspend fun getFarmerById(farmerId: Long): Flow<Farmer?>

}