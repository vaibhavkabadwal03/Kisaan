package com.kisaan.tubewell.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kisaan.tubewell.data.local.entity.Schedule
import kotlinx.coroutines.flow.Flow

@Dao
interface ScheduleDao {

    @Insert
    suspend fun insertSchedule(schedule: Schedule)

    @Query("SELECT * FROM schedule")
    fun getAllSchedules(): Flow<List<Schedule>>

    @Query("SELECT * FROM schedule WHERE slotId = :slotId")
    fun getScheduleById(slotId: Long): Flow<Schedule?>

    @Query("SELECT * FROM schedule WHERE farmerId = :farmerId")
    fun getSchedulesByFarmerId(farmerId: Long): Flow<List<Schedule>>

    @Query("SELECT * FROM schedule WHERE tubewellId = :tubewellId")
    fun getSchedulesByTubewellId(tubewellId: Long): Flow<List<Schedule>>

    @Update
    suspend fun updateSchedule(schedule: Schedule)

    @Delete
    suspend fun deleteSchedule(schedule: Schedule)

}
