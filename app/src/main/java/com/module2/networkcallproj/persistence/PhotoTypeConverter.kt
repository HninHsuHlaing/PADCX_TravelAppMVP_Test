package com.module2.networkcallproj.persistence

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.module2.padc_x_network_call_assignment.Data.VO.ScroleAndReviewVO

class PhotoTypeConverter {
    @TypeConverter
    fun toString(scroe : List<String>): String{

        return Gson().toJson(scroe)
    }
}