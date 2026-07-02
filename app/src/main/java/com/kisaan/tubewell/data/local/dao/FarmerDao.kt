package com.kisaan.tubewell.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kisaan.tubewell.data.local.entity.Farmer
import kotlinx.coroutines.flow.Flow

@Dao
interface FarmerDao {

    @Insert
    suspend fun insertFarmer(farmer: Farmer)

    @Query("SELECT * FROM farmer ORDER BY name ASC")
    fun getAllFarmers(): Flow<List<Farmer>>

    @Query("SELECT * FROM farmer WHERE farmerId = :farmerId")
    fun getFarmerById(farmerId: Long): Flow<Farmer?>

    @Query("SELECT * FROM farmer WHERE name LIKE '%' || :query || '%'")
    fun searchFarmerByName(query: String): Flow<List<Farmer>>

    @Update
    suspend fun updateFarmer(farmer: Farmer)

    @Delete
    suspend fun deleteFarmer(farmer: Farmer)



}