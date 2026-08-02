package com.kisaan.tubewell.di

import android.app.Application
import androidx.room.Room
import com.kisaan.tubewell.data.AppDatabase
import com.kisaan.tubewell.data.local.dao.BorrowDao
import com.kisaan.tubewell.data.local.dao.ComplaintDao
import com.kisaan.tubewell.data.local.dao.FarmerDao
import com.kisaan.tubewell.data.local.dao.GramsabhaDao
import com.kisaan.tubewell.data.local.dao.OperatorDao
import com.kisaan.tubewell.data.local.dao.PaymentDao
import com.kisaan.tubewell.data.local.dao.ScheduleDao
import com.kisaan.tubewell.data.local.dao.TubewellDao
import com.kisaan.tubewell.data.local.dao.UsageDao
import com.kisaan.tubewell.data.local.dao.VillageDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideAppDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(
            application,
            AppDatabase::class.java,
            "app_database"
        ).build()
    }

    @Provides
    fun provideFarmerDao(database: AppDatabase) = database.farmerDao()

    @Provides
    fun provideTubewellDao(database: AppDatabase) = database.tubewellDao()

    @Provides
    fun provideBorrowDao(database: AppDatabase) = database.borrowDao()

    @Provides
    fun provideComplaintDao(database: AppDatabase) = database.complaintDao()

    @Provides
    fun provideGramsabhaDao(database: AppDatabase) = database.gramsabhaDao()

    @Provides
    fun provideOperatorDao(database: AppDatabase) = database.operatorDao()

    @Provides
    fun providePaymentDao(database: AppDatabase) = database.paymentDao()

    @Provides
    fun provideScheduleDao(database: AppDatabase) = database.scheduleDao()

    @Provides
    fun provideUsageDao(database: AppDatabase) = database.usageDao()

    @Provides
    fun provideVillageDao(database: AppDatabase) = database.villageDao()

}