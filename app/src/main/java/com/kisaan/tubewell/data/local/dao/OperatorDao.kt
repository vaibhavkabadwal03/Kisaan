package com.kisaan.tubewell.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kisaan.tubewell.data.local.entity.Operator
import kotlinx.coroutines.flow.Flow

@Dao
interface OperatorDao {

    @Insert
    suspend fun insertOperator(operator: Operator)

    @Query("SELECT * FROM operator ORDER BY name ASC")
    fun getAllOperators(): Flow<List<Operator>>

    @Query("SELECT * FROM operator WHERE operatorId = :operatorId")
    fun getOperatorById(operatorId: Long): Flow<Operator?>

    @Query("SELECT * FROM operator WHERE gramsabhaId = :gramsabhaId")
    fun getOperatorsByGramsabhaId(gramsabhaId: Long): Flow<List<Operator>>

    @Query("SELECT * FROM operator WHERE villageId = :villageId")
    fun getOperatorsByVillageId(villageId: Long): Flow<List<Operator>>

    @Update
    suspend fun updateOperator(operator: Operator)

    @Delete
    suspend fun deleteOperator(operator: Operator)

}
