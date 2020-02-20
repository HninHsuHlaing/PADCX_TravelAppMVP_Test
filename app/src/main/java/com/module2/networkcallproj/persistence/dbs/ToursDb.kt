package com.module2.networkcallproj.persistence.dbs

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.module2.networkcallproj.Data.data.VO.CountryVO
import com.module2.networkcallproj.Data.data.VO.TourVO
import com.module2.networkcallproj.persistence.daos.TourDao
import com.module2.padc_x_network_call_assignment.Data.VO.HotelVO
import com.module2.padc_x_network_call_assignment.Data.VO.TourNewsVO
import kotlin.reflect.KClass

//import kotlin.reflect.KClass


@Database(entities = [TourVO::class], version = 2)
abstract class ToursDb : RoomDatabase(){
    companion object{

        val Tour_DB= "Tours_DB"
        var dbinstnce :ToursDb?= null

        fun getInstance(context: Context):ToursDb{
            when (dbinstnce){
                null->{
                    dbinstnce = Room.databaseBuilder(context,ToursDb::class.java, Tour_DB)
                        .allowMainThreadQueries()
                        .build()
                }

            }
            val i = dbinstnce
            return i!!

        }
    }
    abstract fun tourDao() : TourDao

}