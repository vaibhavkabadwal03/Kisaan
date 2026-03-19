package com.kisaan.tubewell.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.kisaan.tubewell.data.local.dao.FarmerDao
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
import com.kisaan.tubewell.utility.typeconverter.ListConverter

@Database(
    entities = [Borrow::class, Complaint::class, Farmer::class, Gramsabha::class, Operator::class, Payment::class, Schedule::class, Tubewell::class, Usage::class, Village::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(ListConverter::class)
abstract class Appdatabase : RoomDatabase() {

    abstract fun farmerDao(): FarmerDao
    companion object {
        @Volatile
        private var INSTANCE: Appdatabase? = null

        fun getDatabase(context: Context): Appdatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    Appdatabase::class.java,
                    "tubewell_db"
                ).build()

                INSTANCE = instance
                instance
            }
        }
    }

}