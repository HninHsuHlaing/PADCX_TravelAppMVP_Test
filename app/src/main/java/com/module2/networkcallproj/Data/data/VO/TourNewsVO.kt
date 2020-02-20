package com.module2.padc_x_network_call_assignment.Data.VO

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "tour_table")
class TourNewsVO (
    @SerializedName("data")
    var data :ArrayList<HotelVO>  = arrayListOf()

//    @SerializedName("popular_tours")
//    val PopularTours : ArrayList<HotelVO> = arrayListOf()

) {

}