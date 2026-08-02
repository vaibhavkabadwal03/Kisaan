package com.kisaan.tubewell.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kisaan.tubewell.data.local.entity.Borrow
import kotlinx.coroutines.flow.Flow

@Dao
interface BorrowDao {

    @Insert
    suspend fun insertBorrow(borrow: Borrow)

    @Query("SELECT * FROM borrow")
    fun getAllBorrows(): Flow<List<Borrow>>

    @Query("SELECT * FROM borrow WHERE borrowId = :borrowId")
    fun getBorrowById(borrowId: Long): Flow<Borrow?>

    @Query("SELECT * FROM borrow WHERE usageId = :usageId")
    fun getBorrowsByUsageId(usageId: Long): Flow<List<Borrow>>

    @Query("SELECT * FROM borrow WHERE toFarmerId = :farmerId")
    fun getBorrowsByFarmerId(farmerId: Long): Flow<List<Borrow>>

    @Update
    suspend fun updateBorrow(borrow: Borrow)

    @Delete
    suspend fun deleteBorrow(borrow: Borrow)

}
