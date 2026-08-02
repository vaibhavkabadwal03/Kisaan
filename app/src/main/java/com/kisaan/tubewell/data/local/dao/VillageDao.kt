package com.kisaan.tubewell.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kisaan.tubewell.data.local.entity.Village
import kotlinx.coroutines.flow.Flow

@Dao
interface VillageDao {

    @Insert
    suspend fun insertVillage(village: Village)

    @Query("SELECT * FROM village ORDER BY name ASC")
    fun getAllVillages(): Flow<List<Village>>

    @Query("SELECT * FROM village WHERE villageId = :villageId")
    fun getVillageById(villageId: Long): Flow<Village?>

    @Query("SELECT * FROM village WHERE gramsabhaId = :gramsabhaId")
    fun getVillagesByGramsabhaId(gramsabhaId: Long): Flow<List<Village>>

    @Update
    suspend fun updateVillage(village: Village)

    @Delete
    suspend fun deleteVillage(village: Village)

}
