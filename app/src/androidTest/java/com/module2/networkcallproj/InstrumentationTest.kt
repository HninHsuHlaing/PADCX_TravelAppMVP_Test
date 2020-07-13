package com.module2.networkcallproj

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.module2.networkcallproj.Data.data.VO.CountryVO
import com.module2.networkcallproj.persistence.daos.CountryDao
import com.module2.networkcallproj.persistence.daos.TourDao
import com.module2.networkcallproj.persistence.dbs.CountryDb
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class InstrumentationTest {

    private lateinit var mCountryDao : CountryDao
    private lateinit var db : CountryDb

    @Before
    fun setUpDB(){

        val context= ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context,CountryDb::class.java).build()
        mCountryDao=db.CountryDao()
    }

    @After
    fun closeDB(){
        db.close()
    }
    @Test
    fun databaseTest(){
        val countryone = CountryVO()
        countryone.name="Singapore"
        countryone.location="Singapore is located at ........."
        countryone.AverageRating=4.5



        mCountryDao.insertVo(countryone)
        assert(mCountryDao.loadDetailById(countryone.name).value?.name==countryone.name)
    }
}