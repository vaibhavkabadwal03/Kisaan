package com.kisaan.tubewell.data.remote.api

import com.kisaan.tubewell.data.local.entity.Farmer
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("farmers")
    suspend fun getFarmers(): List<Farmer>

    @GET(value = "farmers/{id}")
    suspend fun getFarmerById(@Path("id") id: Long): Farmer

}