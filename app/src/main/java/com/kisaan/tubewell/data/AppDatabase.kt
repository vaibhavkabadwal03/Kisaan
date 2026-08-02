package com.kisaan.tubewell.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
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
import com.kisaan.tubewell.data.local.entity.Borrow
import com.kisaan.tubewell.data.local.entity.Complaint
import com.kisaan.tubewell.data.local.entity.Farmer
import com.kisaan.tubewell.data.local.entity.Gramsabha
import com.kisaan.tubewell.data.local.entity.Operator
import com.kisaan.tubewell.data.local.entity.Payment
import com.kisaan.tubewell.data.local.entity.Schedule
import com.kisaan.tubewell.data.local.entity.Tubewell
import com.kisaan.tubewell.data.local.entity.Usage
import com.kisaan.tubewell.data.local.entity.Village
import com.kisaan.tubewell.core.util.typeconverter.ListConverter

@Database(
    entities = [Borrow::class, Complaint::class, Farmer::class, Gramsabha::class, Operator::class, Payment::class, Schedule::class, Tubewell::class, Usage::class, Village::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(ListConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun farmerDao(): FarmerDao
    abstract fun tubewellDao(): TubewellDao
    abstract fun borrowDao(): BorrowDao
    abstract fun complaintDao(): ComplaintDao
    abstract fun gramsabhaDao(): GramsabhaDao
    abstract fun operatorDao(): OperatorDao
    abstract fun paymentDao(): PaymentDao
    abstract fun scheduleDao(): ScheduleDao
    abstract fun usageDao(): UsageDao
    abstract fun villageDao(): VillageDao

}