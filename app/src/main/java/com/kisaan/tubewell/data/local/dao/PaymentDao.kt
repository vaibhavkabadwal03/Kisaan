package com.kisaan.tubewell.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kisaan.tubewell.data.local.entity.Payment
import kotlinx.coroutines.flow.Flow

@Dao
interface PaymentDao {

    @Insert
    suspend fun insertPayment(payment: Payment)

    @Query("SELECT * FROM payment ORDER BY lastPaidDate DESC")
    fun getAllPayments(): Flow<List<Payment>>

    @Query("SELECT * FROM payment WHERE paymentId = :paymentId")
    fun getPaymentById(paymentId: Long): Flow<Payment?>

    @Query("SELECT * FROM payment WHERE farmerId = :farmerId")
    fun getPaymentsByFarmerId(farmerId: String): Flow<List<Payment>>

    @Query("SELECT * FROM payment WHERE tubewellId = :tubewellId")
    fun getPaymentsByTubewellId(tubewellId: String): Flow<List<Payment>>

    @Update
    suspend fun updatePayment(payment: Payment)

    @Delete
    suspend fun deletePayment(payment: Payment)

}
