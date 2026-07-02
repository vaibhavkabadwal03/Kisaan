package com.kisaan.tubewell.di

import com.kisaan.tubewell.data.repository.FarmerRepository
import com.kisaan.tubewell.data.repository.FarmerRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindFarmerRepository(impl: FarmerRepositoryImpl): FarmerRepository
}