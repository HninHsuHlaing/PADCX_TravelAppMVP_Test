package com.module2.networkcallproj.persistence.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.module2.networkcallproj.Data.data.VO.CountryVO
import com.module2.networkcallproj.Data.data.VO.TourVO

@Dao
interface CountryDao {
    @Query("SELECT * FROM country_table")
    fun getAllCountry(): LiveData<List<CountryVO>>
    @Insert
    fun insertAllNews(tours: List<CountryVO>)
}