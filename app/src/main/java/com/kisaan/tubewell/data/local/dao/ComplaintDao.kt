package com.kisaan.tubewell.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kisaan.tubewell.data.local.entity.Complaint
import kotlinx.coroutines.flow.Flow

@Dao
interface ComplaintDao {

    @Insert
    suspend fun insertComplaint(complaint: Complaint)

    @Query("SELECT * FROM complaint ORDER BY createdAt DESC")
    fun getAllComplaints(): Flow<List<Complaint>>

    @Query("SELECT * FROM complaint WHERE complaintId = :complaintId")
    fun getComplaintById(complaintId: Long): Flow<Complaint?>

    @Query("SELECT * FROM complaint WHERE farmerId = :farmerId ORDER BY createdAt DESC")
    fun getComplaintsByFarmerId(farmerId: Long): Flow<List<Complaint>>

    @Query("SELECT * FROM complaint WHERE tubewellId = :tubewellId ORDER BY createdAt DESC")
    fun getComplaintsByTubewellId(tubewellId: Long): Flow<List<Complaint>>

    @Query("SELECT * FROM complaint WHERE status = :status ORDER BY createdAt DESC")
    fun getComplaintsByStatus(status: String): Flow<List<Complaint>>

    @Update
    suspend fun updateComplaint(complaint: Complaint)

    @Delete
    suspend fun deleteComplaint(complaint: Complaint)

}
