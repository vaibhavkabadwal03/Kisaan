package com.kisaan.tubewell.viewmodel

import androidx.lifecycle.ViewModel
import com.kisaan.tubewell.data.local.entity.Farmer
import com.kisaan.tubewell.data.repository.FarmerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

@HiltViewModel
class FarmerViewModel @Inject constructor(private val repository: FarmerRepository) : ViewModel() {
    private val _farmerId = MutableStateFlow<Long?>(null)

    fun setFarmerId(id: Long) {
        _farmerId.value = id
    }

    val allFarmers = repository.getAllFarmers()

    val farmerById: Flow<Farmer?> =
        _farmerId.flatMapLatest { id ->
            id?.let { repository.getFarmerById(it) } ?: flowOf(null)
        }
}