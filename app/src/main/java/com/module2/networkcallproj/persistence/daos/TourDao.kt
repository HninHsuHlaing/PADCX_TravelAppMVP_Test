package com.module2.networkcallproj.persistence.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.module2.networkcallproj.Data.data.VO.TourVO
import com.module2.padc_x_network_call_assignment.Data.VO.HotelVO
import com.module2.padc_x_network_call_assignment.Data.VO.TourNewsVO

@Dao
interface TourDao {


    @Query("SELECT * FROM tours_table")
    fun getAllTours(): LiveData<List<TourVO>>
    @Insert
    fun insertAllNews(tours: List<TourVO>)

}