package com.kisaan.tubewell.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kisaan.tubewell.data.local.entity.Usage
import kotlinx.coroutines.flow.Flow

@Dao
interface UsageDao {

    @Insert
    suspend fun insertUsage(usage: Usage)

    @Query("SELECT * FROM usage ORDER BY createdAt DESC")
    fun getAllUsages(): Flow<List<Usage>>

    @Query("SELECT * FROM usage WHERE usageId = :usageId")
    fun getUsageById(usageId: Long): Flow<Usage?>

    @Query("SELECT * FROM usage WHERE farmerId = :farmerId ORDER BY createdAt DESC")
    fun getUsagesByFarmerId(farmerId: Long): Flow<List<Usage>>

    @Query("SELECT * FROM usage WHERE tubewellId = :tubewellId ORDER BY createdAt DESC")
    fun getUsagesByTubewellId(tubewellId: Long): Flow<List<Usage>>

    @Update
    suspend fun updateUsage(usage: Usage)

    @Delete
    suspend fun deleteUsage(usage: Usage)

}
