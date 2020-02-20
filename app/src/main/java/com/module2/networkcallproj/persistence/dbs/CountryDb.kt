package com.module2.networkcallproj.persistence.dbs

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.module2.networkcallproj.Data.data.VO.CountryVO
import com.module2.networkcallproj.Data.data.VO.TourVO
import com.module2.networkcallproj.persistence.daos.CountryDao
import com.module2.networkcallproj.persistence.daos.TourDao

@Database (entities = [CountryVO::class], version = 2)
abstract class CountryDb : RoomDatabase(){
    companion object{

        val Country_DB= "Country_DB"
        var dbinstnce :CountryDb?= null
        fun getInstance(context: Context):CountryDb{
            when (dbinstnce){
                null->{
                    dbinstnce = Room.databaseBuilder(context,CountryDb::class.java,Country_DB)
                        .allowMainThreadQueries()
                        .build()
                }

            }
            val i = CountryDb.dbinstnce
            return i!!

        }
    }


    abstract fun CountryDao() : CountryDao
    }
