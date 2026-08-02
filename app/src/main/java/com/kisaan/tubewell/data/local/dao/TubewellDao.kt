package com.kisaan.tubewell.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kisaan.tubewell.data.local.entity.Tubewell
import kotlinx.coroutines.flow.Flow

@Dao
interface TubewellDao {

    @Insert
    suspend fun insertTubewell(tubewell: Tubewell)

    @Query("SELECT * FROM tubewell ORDER BY name ASC")
    fun getAllTubewells(): Flow<List<Tubewell>>

    @Query("SELECT * FROM tubewell WHERE tubewellId = :tubewellId")
    fun getTubewellById(tubewellId: Long): Flow<Tubewell?>

    @Query("SELECT * FROM tubewell WHERE villageId = :villageId")
    fun getTubewellsByVillageId(villageId: Long): Flow<List<Tubewell>>

    @Query("SELECT * FROM tubewell WHERE gramsabhaId = :gramsabhaId")
    fun getTubewellsByGramsabhaId(gramsabhaId: Long): Flow<List<Tubewell>>

    @Query("SELECT * FROM tubewell WHERE operatorId = :operatorId")
    fun getTubewellsByOperatorId(operatorId: Long): Flow<List<Tubewell>>

    @Update
    suspend fun updateTubewell(tubewell: Tubewell)

    @Delete
    suspend fun deleteTubewell(tubewell: Tubewell)

}
