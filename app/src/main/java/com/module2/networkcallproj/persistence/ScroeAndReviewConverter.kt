package com.module2.networkcallproj.persistence

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.module2.padc_x_network_call_assignment.Data.VO.ScroleAndReviewVO

class ScroeAndReviewConverter {

    @TypeConverter
    fun toString(scroe :ScroleAndReviewVO): String{

        return Gson().toJson(scroe)
    }
    @TypeConverter
    fun toUserList(userListJsonString : String) : ArrayList<ScroleAndReviewVO>{
        val userListtype = object : TypeToken<ArrayList<ScroleAndReviewVO>>() {}.type
        return Gson().fromJson(userListJsonString,userListtype)
    }
}