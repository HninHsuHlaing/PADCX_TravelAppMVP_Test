package com.module2.networkcallproj.network.Responses

import com.google.gson.annotations.SerializedName
import com.module2.networkcallproj.Data.data.VO.TourVO
import com.module2.padc_x_network_call_assignment.Data.VO.TourNewsVO

class GetAllTourResponse( @SerializedName("code")
                          val code: Int =0,

                          @SerializedName("message")
                          val message:String ="",

                          @SerializedName("data")
                          val data: ArrayList<TourVO> = arrayListOf()


){
    fun isResponseOK() : Boolean = (data != null ) && (code ==200)
}