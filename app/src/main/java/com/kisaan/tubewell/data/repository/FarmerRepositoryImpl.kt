package com.kisaan.tubewell.data.repository

import com.kisaan.tubewell.data.local.dao.FarmerDao
import com.kisaan.tubewell.data.local.entity.Farmer
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FarmerRepositoryImpl @Inject constructor(private val farmerDao: FarmerDao): FarmerRepository {

    override suspend fun insertFarmer(farmer: Farmer) {
        farmerDao.insertFarmer(farmer)
    }

    override fun getAllFarmers(): Flow<List<Farmer>> = farmerDao.getAllFarmers()

    override fun getFarmerById(farmerId: Long): Flow<Farmer?> = farmerDao.getFarmerById(farmerId)

}