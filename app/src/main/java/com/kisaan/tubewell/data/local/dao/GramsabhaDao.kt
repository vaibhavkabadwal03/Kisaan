package com.kisaan.tubewell.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kisaan.tubewell.data.local.entity.Gramsabha
import kotlinx.coroutines.flow.Flow

@Dao
interface GramsabhaDao {

    @Insert
    suspend fun insertGramsabha(gramsabha: Gramsabha)

    @Query("SELECT * FROM gramsabha ORDER BY name ASC")
    fun getAllGramsabhas(): Flow<List<Gramsabha>>

    @Query("SELECT * FROM gramsabha WHERE gramsabhaId = :gramsabhaId")
    fun getGramsabhaById(gramsabhaId: Long): Flow<Gramsabha?>

    @Update
    suspend fun updateGramsabha(gramsabha: Gramsabha)

    @Delete
    suspend fun deleteGramsabha(gramsabha: Gramsabha)

}
